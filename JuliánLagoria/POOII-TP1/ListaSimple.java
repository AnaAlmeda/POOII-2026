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
            primerNodo = nuevodato;
        }


    }
}

public void mostrar(){
    if(primerNodo == null){
        System.out.println("No eiene elementos para mostrar");
        return;
    }

    while(primerNodo != null){
        System.out.println("Dato guardado: " + primerNodo.dato);
        primerNodo.siguiente = primerNodo;
    }
}