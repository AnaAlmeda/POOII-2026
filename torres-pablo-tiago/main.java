class NodoCancion {
    int idCancion;
    NodoCancion siguiente;

    public NodoCancion(int idCancion) {
        this.idCancion = idCancion;
        this.siguiente = null;
    }
}

class ListaReproduccion {
    NodoCancion cabeza;

    public ListaReproduccion() {
        this.cabeza = null;
    }

    public void agregar(int idCancion) {
        NodoCancion nuevo = new NodoCancion(idCancion);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoCancion actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void eliminar(int idCancion) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (cabeza.idCancion == idCancion) {
            cabeza = cabeza.siguiente;
            return;
        }

        NodoCancion actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.idCancion != idCancion) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("Lista de reproducción vacía.");
            return;
        }

        NodoCancion actual = cabeza;
        System.out.print("Playlist: ");
        while (actual != null) {
            System.out.print("[Canción ID: " + actual.idCancion + "] -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
  class ListaMusica {
    public static void main(String[] args) {
        ListaReproduccion playlist = new ListaReproduccion();

        playlist.agregar(10);
        playlist.agregar(20);
        playlist.agregar(30);
        playlist.agregar(40);

        System.out.println("--- Lista inicial ---");
        playlist.mostrar();

        System.out.println("\nEliminando canción con ID 10 (cabeza)...");
        playlist.eliminar(10);
        playlist.mostrar();

        System.out.println("\nEliminando canción con ID 30...");
        playlist.eliminar(30);
        playlist.mostrar();
    }
}