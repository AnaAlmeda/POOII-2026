public class ListaSimple {

    Nodo primerNodo;

    public ListaSimple() {
        primerNodo = null;
    }

    public void mostrar() {
        if (primerNodo == null) {
            System.out.println("no tiene elementos para mostrar");
            return;
        }
        Nodo nodocopia = primerNodo;
        while (nodocopia != null) {
            System.out.println(
                "Id: " + nodocopia.idCancion + " - " + nodocopia.nombreCancion
            );
            nodocopia = nodocopia.nodosiguiente;
        }
    }

    public void agregar(int idCancion, String nombreCancion) {
        Nodo nuevoNodo = new Nodo(idCancion, nombreCancion);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
        } else {
            Nodo nodoActual = primerNodo;
            while (nodoActual.nodosiguiente != null) {
                nodoActual = nodoActual.nodosiguiente;
            }
            nodoActual.nodosiguiente = nuevoNodo;
        }
    }

    public void eliminar(int idCancionEliminar) {
        if (primerNodo == null) {
            System.out.println("Lista vacía xd");
            return;
        }

        if (primerNodo.idCancion == idCancionEliminar) {
            primerNodo = primerNodo.nodosiguiente;
            return;
        }

        Nodo nodoActual = primerNodo;
        Nodo nodoAnterior = null;

        while (
            nodoActual != null && nodoActual.idCancion != idCancionEliminar
        ) {
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.nodosiguiente;
        }
        if (nodoActual == null) {
            System.out.println("No hay nada");
            return;
        }
        nodoAnterior.nodosiguiente = nodoActual.nodosiguiente;
    }
}
