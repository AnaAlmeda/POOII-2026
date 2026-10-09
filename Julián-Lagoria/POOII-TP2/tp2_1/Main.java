import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EquipoProyecto equipo = new EquipoProyecto();
        int opcion;

        do {
            System.out.println(
                "\n=== GESTIÓN DE EQUIPO DE DESARROLLO (Lista Simple) ==="
            );
            System.out.println("1. Agregar miembro (Alta controlada)");
            System.out.println("2. Dar de baja miembro por DNI");
            System.out.println("3. Buscar miembro por DNI");
            System.out.println("4. Mostrar listado general");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, ingrese un número válido: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese Rol (ej. Developer, Tester): ");
                    String rol = scanner.nextLine();

                    Persona nueva = new Persona(
                        dni,
                        nombre,
                        apellido,
                        edad,
                        rol
                    );
                    equipo.agregarMiembro(nueva);
                    break;
                case 2:
                    System.out.print(
                        "Ingrese el DNI del miembro a dar de baja: "
                    );
                    equipo.eliminarMiembro(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Ingrese el DNI a buscar: ");
                    Persona encontrada = equipo.buscarPorDni(
                        scanner.nextLine()
                    );
                    if (encontrada != null) {
                        System.out.println("Persona encontrada: " + encontrada);
                    } else {
                        System.out.println(
                            "No se encontró ninguna persona con ese DNI."
                        );
                    }
                    break;
                case 4:
                    equipo.mostrarEquipo();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
