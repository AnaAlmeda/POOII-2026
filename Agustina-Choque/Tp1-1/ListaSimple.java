
public class ListaSimple {
    Nodo primerNodo;
    public ListaSimple(){
        primerNodo = null;
    }

    public void agregar(int dato){
        Nodo nuevodato = new Nodo(dato);

        if(primerNodo == null){
            primerNodo = nuevodato;
        }else{
            Nodo nodocopia = primerNodo;
            while (nodocopia.nodosiguiente != null) {
                nodocopia = nodocopia.nodosiguiente;                
            }
            nodocopia.nodosiguiente = nuevodato;
        }
    }
    public void mostrar(){
        if (primerNodo == null){
            System.out.println( "No tiene elementos para mostrar");
            return;
        }
        Nodo nodocopia = primerNodo;
        while (nodocopia != null) {
            System.out.println("dato guardado:" + nodocopia.dato);
            nodocopia = nodocopia.nodosiguiente;
        }
    }
}
