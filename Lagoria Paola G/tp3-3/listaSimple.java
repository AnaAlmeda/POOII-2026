public class listaSimple {
    Nodo cabeza;

    public void agregar(int idCancion) {
        Nodo nuevo = new Nodo(idCancion);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void eliminar(int idCancion) {
        if (cabeza == null) return;

        // Si es la cabeza
        if (cabeza.idCancion == idCancion) {
            cabeza = cabeza.siguiente;
            return;
        }

        // Si está en otro lugar
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.idCancion == idCancion) {
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.idCancion + " ");
            actual = actual.siguiente;
        }
        System.out.println();
     }
 }