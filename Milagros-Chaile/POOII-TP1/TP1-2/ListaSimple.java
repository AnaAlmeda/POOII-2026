public class ListaSimple {
    Nodo primerNodo;
    
    public ListaSimple() {
        primerNodo = null;
    }
    public void agregar_producto(int dato){
        Nodo nuevodato = new Nodo(dato);
        if (primerNodo==null) {
            primerNodo = nuevodato;
        } else {
            Nodo nodocopia = primerNodo;
            while (nodocopia.nodosiguiente != null) {
                nodocopia = nodocopia.nodosiguiente;
            }
            nodocopia.nodosiguiente = nuevodato;
        }
    }

    public void mostrar_producto(){

        if (primerNodo==null){
            System.out.println("no tiene elementos para mostrar");
            return;
            } 

        Nodo nodocopia = primerNodo;
        while (nodocopia != null){
            System.out.println("codigo guardado" + nodocopia.dato);
            nodocopia = nodocopia.nodosiguiente;
        }
    }

    public boolean buscar_producto(int datoBuscado) {

    Nodo nodocopia = primerNodo;

    while (nodocopia != null) {

        if (nodocopia.dato == datoBuscado) {
            return true;
        }

        nodocopia = nodocopia.nodosiguiente;
    }

    return false;
}

}
