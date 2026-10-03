public class ListasSimples {

    Nodo primernodo;

    public ListasSimples() {
        primernodo = null;
    }

    public void agregar(int dato) {

        Nodo nuevodato = new Nodo(dato);

        if (primernodo == null) {
            primernodo = nuevodato;
        } else {

            Nodo nodocopia = primernodo;

            while (nodocopia.siguiente != null) {
                nodocopia = nodocopia.siguiente;
            }

            nodocopia.siguiente = nuevodato;
        }
    }

    public void mostrar() {

        if (primernodo == null) {
            System.out.println("No tiene elementos para mostrar");
            return;
        }

        Nodo nodocopia = primernodo;

        while (nodocopia != null) {
            System.out.println("Dato guardado: " + nodocopia.dato);
            nodocopia = nodocopia.siguiente;
        }
    }
}
