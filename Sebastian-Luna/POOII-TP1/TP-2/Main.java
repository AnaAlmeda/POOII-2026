import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ListaSimple lSimple = new ListaSimple();
        Scanner teclado = new Scanner(System.in);

        lSimple.agregar(404);

        lSimple.agregar(200);

        lSimple.agregar(305);

        lSimple.agregar(2);

        

        System.out.print("Ingrese un código: ");
        int codigo = teclado.nextInt();
        

        if (lSimple.buscar (codigo)) {
            System.out.print("El codigo si existe! ");
        } else {
            System.out.print("El codigo no existe! ");
        }

        teclado.close();

    }

}