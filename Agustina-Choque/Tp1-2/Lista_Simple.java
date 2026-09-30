public class Lista_Simple {
    Nodo primerNodo;
    public Lista_Simple() {
        primerNodo = null;
    }

    public void agregar_producto(int dato){
        Nodo nuevodato = new Nodo(dato);

        if (primerNodo == null) {
            primerNodo = nuevodato;  
        }else{
            Nodo nodocopia = primerNodo;
            while (nodocopia.nodosiguiente !=null) {
                nodocopia = nodocopia.nodosiguiente;
            }
            nodocopia.nodosiguiente = nuevodato;
        }
    }

    public void mostrar_producto(){
        if (primerNodo == null){
            System.out.println( "No tiene elementos para mostrar");
            return;
        }
    }

    public boolean buscar(int codigoBuscado) {
    if (primerNodo == null) {
        System.out.println("No hay elementos en la lista");
        return false;
    }
    Nodo nodocopia = primerNodo;
    while (nodocopia != null) {
        if (nodocopia.dato == codigoBuscado) {
            return true;
        }
        nodocopia = nodocopia.nodosiguiente;
    }
    return false;
    }

}

