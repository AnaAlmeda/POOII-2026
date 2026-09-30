public class ListaSimple {
    Nodo primerNodo;

    public ListaSimple(){
        primerNodo = null;
    }

    public void agregar_producto(int dato){
        Nodo nuevocodigo = new Nodo(dato);

        if (primerNodo == null){
            primerNodo = nuevocodigo;
        }else{
            Nodo nodocopia = primerNodo;
            while(nodocopia.nodoSiguiente != null){
                nodocopia = nodocopia.nodoSiguiente;
            }
            nodocopia.nodoSiguiente = nuevocodigo;
        }
    }

    public void mostrar_producto(){
        if (primerNodo == null){
            System.out.print("no tiene elementos para mostrar.");
            return;
        }
        Nodo nodocopia = primerNodo;
        while (nodocopia != null){
            System.out.println("codigo guardado: " + nodocopia.dato);
            nodocopia = nodocopia.nodoSiguiente;
        }
    }
    
    public void buscar_producto(int codigo_producto){
        if (primerNodo == null){
            System.out.println("No hay productos en la lista.");
            return;
        }
        Nodo nodocopia = primerNodo;
        while (nodocopia != null){
            System.out.println("codigo guardado: " + nodocopia.dato);
            nodocopia = nodocopia.nodoSiguiente;
            return;
        }
    }
}
