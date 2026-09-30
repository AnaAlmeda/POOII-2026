
public class ListaSimple {
    Nodo primerNodo;


    public ListaSimple () {
        primerNodo = null;
    }

    public void agregar (int codigo){
        Nodo nuevocodigo = new Nodo(codigo);

        if (primerNodo == null) {
            primerNodo = nuevocodigo;
        }else {
            Nodo nodocopia = primerNodo;
            while (nodocopia.nodosiguiente != null) {
                nodocopia = nodocopia.nodosiguiente;
            }
            nodocopia.nodosiguiente = nuevocodigo;
        }
    }
    
    public void mostrar () {
        if (primerNodo == null) {
            System.out.println("no tiene elementos para mostrar");
            return;
        }

        Nodo nodocopia = primerNodo;

        while (primerNodo != null) {
            System.out.println("Codigo guardado: " + primerNodo.codigo);
            nodocopia = nodocopia.nodosiguiente;
        }
    }

    public boolean buscar (int codigo) {
        Nodo nodoActual = primerNodo;

        while (nodoActual != null) {
            if (nodoActual.codigo == codigo) {
                return true;
            }

            nodoActual = nodoActual.nodosiguiente;
        }
        return false;
    }
}