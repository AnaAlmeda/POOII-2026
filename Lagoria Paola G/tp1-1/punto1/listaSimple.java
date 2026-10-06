
public class listaSimple {

    Nodo primerNodo;

    public listaSimple() {
        primerNodo = null;
    }

    public void agregar(int dato) {
        Nodo nuevodato = new Nodo(dato);

        if (primerNodo == null) {
            primerNodo = nuevodato;
        } else {
            Nodo nodoCopia = primerNodo;
            while (nodoCopia.nodosiguiente != null) {
                nodoCopia = nodoCopia.nodosiguiente;
            }
            nodoCopia.nodosiguiente = nuevodato;
        }
    }

    public void mostrar() {
        if (primerNodo == null) {
            System.out.println("No tiene elementos para mostrar");
            return;
        }
        Nodo nodoCopia = primerNodo;
        while (nodoCopia != null) {
            System.out.println("Dato guardado: " + nodoCopia.dato);
            nodoCopia = nodoCopia.nodosiguiente;
        }
    }
}
