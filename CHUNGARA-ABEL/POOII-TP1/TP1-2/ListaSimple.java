
public class ListaSimple {

    Nodo primerNodo;

    public ListaSimple() {
        primerNodo = null;
    }

    public void agregar(int codigo) {

        Nodo nuevoCodigo = new Nodo(codigo);

        if (primerNodo == null) {
            primerNodo = nuevoCodigo;
        } else {

            Nodo nodoCopia = primerNodo;

            while (nodoCopia.nodosiguiente != null) {
                nodoCopia = nodoCopia.nodosiguiente;
            }

            nodoCopia.nodosiguiente = nuevoCodigo;
        }
    }

    public void mostrar() {

        if (primerNodo == null) {
            System.out.println("No tiene elementos para mostrar");
            return;
        }

        Nodo nodoCopia = primerNodo;

        while (nodoCopia != null) {
            System.out.println("Codigo guardado: " + nodoCopia.codigo);
            nodoCopia = nodoCopia.nodosiguiente;
        }
    }

    public boolean buscar(int codigoBuscado) {

        Nodo nodoActual = primerNodo;

        while (nodoActual != null) {

            if (nodoActual.codigo == codigoBuscado) {
                return true;
            }

            nodoActual = nodoActual.nodosiguiente;
        }

        return false;
    }
}