package tp1_3;

public class Main {

    public static void main(String[] args) {
        ListaSimple miPlaylist = new ListaSimple();
        miPlaylist.agregar(101, "I am the Highway - Audioslave");
        System.out.println("Canción 101 agregada");
        miPlaylist.agregar(102, "Drag Path - Twenty One Pilots");
        System.out.println("Canción 102 agregada");
        miPlaylist.agregar(103, "Somewhere I belong - Likin Park");
        System.out.println("Canción 103 agregada");
        miPlaylist.agregar(104, "El Viejo- La Vela Puerca");
        System.out.println("Canción 104 agregada");

        System.out.println("Playlist cargada");
        System.out.println("*********************************************");

        miPlaylist.mostrar();
        System.out.println("*********************************************");

        miPlaylist.eliminar(103);
        miPlaylist.mostrar();
        System.out.println("Canción Eliminada");

        System.out.println("*********************************************");
        miPlaylist.agregar(105, "Será - Las Pelotas");
        miPlaylist.mostrar();
        System.out.println("Canción Agregada");

        System.out.println("*********************************************");
    }
}
