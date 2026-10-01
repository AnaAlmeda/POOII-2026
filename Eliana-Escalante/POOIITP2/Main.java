package POOII-2026.Eliana-Escalante.POOIITP2;

public class Main {
    public static void main(String[] args) {

        ListaSimple lista = new ListaSimple();
        lista.agregar(101);
        lista.agregar(102);
        lista.agregar(103);
        lista.agregar(104);
        int codigoBuscado = 103;
        if (lista.buscar(codigoBuscado)) {

            System.out.println("El código " + codigoBuscado + " está disponible.");

        } else {

            System.out.println("El código " + codigoBuscado + " no está disponible.");

        }
    }
}
