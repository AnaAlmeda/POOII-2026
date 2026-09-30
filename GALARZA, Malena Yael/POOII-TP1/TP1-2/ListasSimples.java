public class ListasSimples {
    Nodo primerNodo;
    public ListasSimples(){
        primerNodo = null;
    }

    public void agregar_producto (int codigo){
        Nodo nuevocodigo = new Nodo(codigo);
        if (primerNodo == null){
            primerNodo = nuevocodigo;
        }else{
            Nodo nodocopia = primerNodo;
            while(nodocopia.nodossiguiente!= null){
                nodocopia = nodocopia.nodossiguiente;
            }
            nodocopia.nodossiguiente=nuevocodigo;
        }
    }
    public boolean buscar (int codigoBuscado){
        Nodo nodocopia = primerNodo;
        while (nodocopia != null) {
            if (nodocopia.codigo == codigoBuscado) {
                return true;
            }
            nodocopia = nodocopia.nodossiguiente;
        }
        return false;
    }
    
    public void mostrar_producto (){
        if (primerNodo == null){
            System.out.println("no tiene elemento para mostrar");
            return;
        }
        Nodo nodocopia = primerNodo;
        while (nodocopia != null) {
            System.out.println("Codigo guardado:" + nodocopia.codigo);
            nodocopia =  nodocopia.nodossiguiente;
        }
    }

    
}