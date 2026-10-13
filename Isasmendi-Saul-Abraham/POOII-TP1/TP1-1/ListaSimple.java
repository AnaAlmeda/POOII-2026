public class ListaSimple {
    Nodo primerNodo;
    
    public ListaSimple(){

        primerNodo = null;

    }
    public void agregar(int dato) {

        Nodo nuevoDato = new Nodo(dato);
        if (primerNodo == null){
            primerNodo = nuevoDato;
        }
        else{
            Nodo Nodocopia = primerNodo;
            while (Nodocopia.nodosiguiente != null)

        {
            Nodocopia = Nodocopia.nodosiguiente;
        }
        Nodocopia.nodosiguiente = nuevoDato;
    }
}
public void mostrar(){//metodo//
    if (primerNodo == null) {
        System.out.println("no tiene elementos para mostrar");
        return ;
    }
    Nodo Nodocopia = primerNodo;
    while(Nodocopia != null){
        System.out.println("dato guardado:" + Nodocopia.dato);   
    Nodocopia =  Nodocopia.nodosiguiente; 
    }

} 
}
