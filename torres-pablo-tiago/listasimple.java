class NodoProducto {
    int codigo;
    NodoProducto siguiente;

    public NodoProducto(int codigo) {
        this.codigo = codigo;
        this.siguiente = null;
    }
}

class ListaProductos {
    NodoProducto cabeza;

    public ListaProductos() {
        this.cabeza = null;
    }

    public void agregar(int codigo) {
        NodoProducto nuevo = new NodoProducto(codigo);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoProducto actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public boolean buscar(int codigoBuscado) {
        NodoProducto actual = cabeza;
        while (actual != null) {
            if (actual.codigo == codigoBuscado) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }
}

public class ControlStock {
    public static void main(String[] args) {
        ListaProductos stock = new ListaProductos();

        stock.agregar(501);
        stock.agregar(502);
        stock.agregar(503);
        stock.agregar(504);

        int codigoABuscar = 503;
        if (stock.buscar(codigoABuscar)) {
            System.out.println("El producto con código " + codigoABuscar + " se encuentra disponible.");
        } else {
            System.out.println("El producto con código " + codigoABuscar + " NO está en stock.");
        }

        int codigoInexistente = 999;
        if (stock.buscar(codigoInexistente)) {
            System.out.println("El producto con código " + codigoInexistente + " se encuentra disponible.");
        } else {
            System.out.println("El producto con código " + codigoInexistente + " NO está en stock.");
        }
    }
}