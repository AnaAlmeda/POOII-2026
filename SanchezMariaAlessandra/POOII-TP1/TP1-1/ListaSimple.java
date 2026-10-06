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
            while(nodocopia.nodoSiguiente != null){
                nodocopia = nodocopia.nodoSiguiente;
            }
            nodocopia.nodoSiguiente = nuevodato;
        }
    }

    public void mostrar(){
        if (primerNodo == null){
            System.out.print("no tiene elementos para mostrar.");
            return;
        }
        Nodo nodocopia = primerNodo;
        while (primerNodo != null){
            System.out.println("dato guardado: " + nodocopia.dato);
            nodocopia = nodocopia.nodoSiguiente;
        }
    } 
}
