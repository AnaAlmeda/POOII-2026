public class Main {

    public static void main(String[] args) {

        listaSimple lista = new listaSimple();
        lista.agregar_canciones(101);
        lista.agregar_canciones(202);
        lista.agregar_canciones(303);
        lista.agregar_canciones(404);

        System.out.println("Lista original:");
        lista.mostrar_canciones();

        System.out.println("Modificando la cancion 202 por 999");
        lista.modificar(202, 999);

        System.out.println("Lista despues de modificar:");
        lista.mostrar_canciones();

        System.out.println("Eliminando la cancion 303");
        lista.eliminar_canciones(303);

        System.out.println("Lista despues de eliminar:");
        lista.mostrar_canciones();
    }
}
