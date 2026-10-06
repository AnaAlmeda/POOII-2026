public class Main {
    public static void main(String[] args) {
        ListasSimples lista = new ListasSimples();
        lista.agregarCancion(1);
        lista.agregarCancion(2);
        lista.agregarCancion(3);
        lista.mostrarCancion();
        lista.eliminarCancion(2);
        lista.mostrarCancion  ();
    }
}
