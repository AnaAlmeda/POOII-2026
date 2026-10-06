public class ListaCancion {
    Nodo2 primerNodo;

    public ListaCancion(){
        primerNodo=null;
    }

    public void agregar(int idCancion){
        Nodo2 nuevodato = new Nodo2(idCancion);
        if (primerNodo == null){
            primerNodo = nuevodato;
        }else{
            Nodo2 nodocopia = primerNodo;
            while (nodocopia.siguiente != null){
                nodocopia = nodocopia.siguiente;
            }
           nodocopia.siguiente = nuevodato;
        }
    }
    public void eliminar (int idCancion){
        Nodo2 actual = primerNodo;
        Nodo2 anterior = null;
        while (actual != null){
            if(actual.idCancion == idCancion ){
                if(anterior == null){
                    primerNodo = actual.siguiente;
                }else{
                    anterior.siguiente = actual.siguiente;
                }
                return;

            }
            anterior = actual;
            actual = actual.siguiente;


        }
    }
    public void mostrar(){
        if (primerNodo == null){
            System.out.println("No tiene canciones para mostrar");
            return;
        }
        Nodo2 nodocopia = primerNodo;
        while (nodocopia != null){
            System.out.println("Cancion:" + nodocopia.idCancion);
            nodocopia = nodocopia.siguiente;
        }
    }
}
