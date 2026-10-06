public class ListaSimple {
    Nodo primerNodo;

    public ListaSimple(){
        primerNodo = null;
    }

    public void agregar(int dato){
        Nodo nuevodato = new Nodo(dato);

        if (primerNodo == null){
            primerNodo = nuevodato;
        }else{
            Nodo nodocopia = primerNodo;
            while(nodocopia.nodosiguiente != null){
                nodocopia = nodocopia.nodosiguiente;
            }
            nodocopia.nodosiguiente = nuevodato;
        }
    }