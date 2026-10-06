public class listasimple{
    Nodo primerNodo;

    public listasimple(){

        primerNodo = null;
    }

    public void agregar(int dato){
        Nodo nuevodato = new Nodo(dato);

        if (primerNodo = null){

            primerNodo= nuevodato;

        }else{
           
            while(primerNodo.nodosiguiente != null){
                 Nodo nodocopia = primerNodo;
            }

            nodocopia.nodosiguiente = nuevodato;
        }

    
    }
    public void mostrar (){
        if (primerNodo == null){
            system.out.println (x:"no tiene elemnto para mostrar");
            return;
        }
        Nodo nodocopia = primerNodo;
        while(primerNodo != null){
            system.out.println("dato guardado:"+ primerNodo.dato);
            primerNodo.siguiente = primerNodo;
        }
    }
}