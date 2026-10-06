
public class MainMusica {

    public static void MainMusica(String[] args) {

        ListaSimple listaMusica = new ListaSimple();

        listaMusica.agregar(101);
        listaMusica.agregar(202);
        listaMusica.agregar(303);
        listaMusica.agregar(404);


        System.out.println("LISTA ORIGINAL");

        listaMusica.mostrar();


        System.out.println("\nEliminando canción 303...");

        listaMusica.eliminar(303);


        System.out.println("\nLISTA ACTUALIZADA");

        listaMusica.mostrar();
    }
}