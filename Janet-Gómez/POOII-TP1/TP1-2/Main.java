

public class Main {
    public static void main(String[] args) 
    {
        ListaSimple lista = new ListaSimple();
        lista.agregar(1001);
        lista.agregar(1002);
        lista.agregar(1003);

        int codigoBuscado = 1002;
        if (lista.buscar(codigoBuscado)) {
            System.out.println("El producto con código " + codigoBuscado + " está disponible.");
        } else {
            System.out.println("El código " + codigoBuscado + " no está disponible.");
        }
    }
}
