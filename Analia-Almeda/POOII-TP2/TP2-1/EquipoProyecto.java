/*cumple el rol de Lista Simple */
public class EquipoProyecto {
    private Nodo cabeza;
    private int cantidadTotal;

    public EquipoProyecto() {
        this.cabeza = null;
        this.cantidadTotal = 0;
    }

    // 1. Alta (add)
    public boolean agregarMiembro(Persona nuevaPersona) {
        if (buscarPorDni(nuevaPersona.getDni()) != null) {
            System.out.println("Error: Ya existe un miembro con el DNI " + nuevaPersona.getDni());
            return false;
        }

        Nodo nuevoNodo = new Nodo(nuevaPersona);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        cantidadTotal++;
        System.out.println("Miembro agregado con éxito.");
        return true;
    }

    // 2. remove
    public boolean eliminarMiembro(String dni) {
        if (cabeza == null) {
            System.out.println("Error: El equipo está vacío.");
            return false;
        }

        if (cabeza.getPersona().getDni().equals(dni)) {
            cabeza = cabeza.getSiguiente();
            cantidadTotal--;
            System.out.println("✅ Miembro dado de baja con éxito.");
            return true;
        }

        System.out.println("Error: No se encontró un miembro con el DNI " + dni);
        return false;
    }

    // 3. Busca por DNI
    public Persona buscarPorDni(String dni) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getPersona().getDni().equals(dni)) {
                return actual.getPersona();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    // 4. Listado general
    public void mostrarEquipo() {
        if (cabeza == null) {
            System.out.println("El equipo de proyecto no tiene integrantes actualmente.");
            return;
        }

        System.out.println("\n--- INTEGRANTES DEL EQUIPO DE PROYECTO ---");
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getPersona());
            actual = actual.getSiguiente();
        }
        System.out.println("Total de integrantes: " + cantidadTotal + "\n");
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }
}