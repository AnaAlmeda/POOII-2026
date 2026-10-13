public class ListaSimple {
    Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }


    public void agregar(int codigo) {
        Nodo nuevoNodo = new Nodo(codigo);
        
    
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
        
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
        
            actual.siguiente = nuevoNodo;
        }
    }

    
    public boolean buscar(int codigoBuscado) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.codigo == codigoBuscado) {
                return true; 
            }
            actual = actual.siguiente;
        }
        return false; 
    }
}