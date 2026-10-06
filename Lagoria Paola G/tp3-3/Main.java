public class Main{
    public static void main(String[] args) {
        listaSimple lista = new listaSimple ();

        lista.agregar(101);
        lista.agregar(102);
        lista.agregar(103);
        lista.agregar(104);

        System.out.println("Antes:");
        lista.mostrar();

        lista.eliminar(103);

        System.out.println("Después:");
        lista.mostrar();
     }
 }