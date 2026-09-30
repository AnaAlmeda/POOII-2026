public class ListasSimples {
    Nodo primerNodo;
    public ListasSimples(){
        primerNodo = null;
    }

    public void agregar(int dato){
        Nodo nuevodato = new Nodo(dato);
        if (primerNodo == null){
            primerNodo = nuevodato;
        }else{
            Nodo nodocopia = primerNodo;
            while(nodocopia.nodossiguiente!= null){
                nodocopia = nodocopia.nodossiguiente;
            }
            nodocopia.nodossiguiente=nuevodato;
        }
    }
    
    public void mostrar(){
        if (primerNodo == null){
            System.out.println("no tiene elemento para mostrar");
            return;
        }
        Nodo nodocopia = primerNodo;
        while (primerNodo != null) {
            System.out.println("Dato guardado:" + nodocopia.dato);
            nodocopia =  nodocopia.nodossiguiente;
        }
    }
}
