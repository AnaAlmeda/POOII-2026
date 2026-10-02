public class listaSimple {
    Nodo primerNodo;
    public listaSimple(){
        primerNodo = null;
    }

     public void agregar_canciones(int idCancion){
        Nodo nuevodato = new Nodo(idCancion);

        if(primerNodo == null){
            primerNodo = nuevodato;
        }else{
            Nodo nodocopia = primerNodo;
            while (nodocopia.siguiente != null) {
                nodocopia = nodocopia.siguiente;                
            }
            nodocopia.siguiente = nuevodato;
        }
    }

    public void eliminar_canciones(int idCancion){
    
    if (primerNodo == null) {
        System.out.println("La lista esta vacia");
        return;
    }

    if (primerNodo.idCancion == idCancion) {
        primerNodo = primerNodo.siguiente;
        return;
    }

    Nodo actual = primerNodo;
    while (actual.siguiente != null) {

        if (actual.siguiente.idCancion == idCancion) {
            actual.siguiente = actual.siguiente.siguiente;
            return;
        }
        actual = actual.siguiente;
    }
    System.out.println("No se encontro la cancion.");
    }

    public void mostrar_canciones() {

        if (primerNodo == null) {
        System.out.println("La lista esta vacia");
        return;
        }

        Nodo actual = primerNodo;

        while (actual != null) {
        System.out.print(actual.idCancion + " -> ");
        actual = actual.siguiente;
        }
    }

    public void modificar(int idCancion, int nuevoId) {

        Nodo actual = primerNodo;

        while (actual != null) {
        if (actual.idCancion == idCancion) {
            actual.idCancion = nuevoId;
            return;
        }
        actual = actual.siguiente;
        }

        System.out.println("No se encontro la cancion.");
    }
    
}

