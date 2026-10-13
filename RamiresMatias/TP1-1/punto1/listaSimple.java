public class listaSimple{

    Nodo primerNodo;

    public listaSimple(){
        primerNodo = null;

    }

    public void agregar(int dato){
        Nodo nuevodato= new Nodo{dato};

        if (primerNodo==null){
            primerNodo=nuevodato,

        }else{
            Nodo nodoCopia=primerNodo;
            while{primerNodo.nodosiguiente!=null}{
                nodoCopia=nodoCopia.nodosiguiente;
            }
            nodoCopia.nodosiguiente=nuevodato;
        }
    }


    public void mostrar(){
        if (primerNodo==null){
            system.out.printin(x:"no tiene elementos para mostrar");
            return;
        }
        Nodo nodoCopia=primerNodo;
        while (primerNodo!=null){
            system.out.printin("dato guardado"+ primerNodo.dato);
            primerNodo.siguiente =primerNodo;
        }
    }
}