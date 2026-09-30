class Nodo {
    int valor;
    Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

class ListaTurnos {
    Nodo cabeza;

    public ListaTurnos() {
        this.cabeza = null;
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);

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

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("No hay turnos registrados.");
            return;
        }

        Nodo actual = cabeza;
        System.out.print("Turnos: ");
        while (actual != null) {
            System.out.print("[" + actual.valor + "] -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}

public class ListaProductos {
    public static void main(String[] args) {
        ListaTurnos lista = new ListaTurnos();

        lista.agregar(101);
        lista.agregar(102);
        lista.agregar(103);

        lista.mostrar();
    }
}