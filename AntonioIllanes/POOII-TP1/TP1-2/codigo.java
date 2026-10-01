public class codigo {
    Nodo1 primerNodo;

    public codigo(){
        primerNodo=null;
    }

    public void agregar(int codigo){
        Nodo1 nuevodato = new Nodo1(codigo);
        if (primerNodo == null){
            primerNodo = nuevodato;
        }else{
            Nodo1 nodocopia = primerNodo;
            while (nodocopia.nodosiguiente != null){
                nodocopia = nodocopia.nodosiguiente;
            }
           nodocopia.nodosiguiente = nuevodato;
        }
    }
    public boolean buscar(int codigoBuscado){
        Nodo1 actual = primerNodo;
        while(actual != null){
            if (actual.codigo == codigoBuscado) {
                return true;
            }
            actual = actual.nodosiguiente;
        }
        return false;
        
    }
    public void mostrar(){
        if (primerNodo == null){
            System.out.println("No tiene elementos para mostrar");
            return;
        }
        Nodo1 nodocopia = primerNodo;
        while (nodocopia != null){
            System.out.println("codigo guardado" + nodocopia.codigo);
            nodocopia = nodocopia.nodosiguiente;
        }
    }
}
