public class ListasSimples {
    Nodo primerNodo;
    public ListasSimples(){
        primerNodo = null;
    }

    public void agregarCancion (int idCancion){
        Nodo nuevaCancion = new Nodo(idCancion);
        if (primerNodo == null){
            primerNodo = nuevaCancion;
        }else{
            Nodo nodocopia = primerNodo;
            while(nodocopia.nodossiguiente!= null){
                nodocopia = nodocopia.nodossiguiente;
            }
            nodocopia.nodossiguiente=nuevaCancion;
        }
    }
    /*public boolean buscar (int idCancionBuscada){
        Nodo nodocopia = primerNodo;
        while (nodocopia != null) {
            if (nodocopia.codigo == idCancionBuscada) {
                return true;
            }
            nodocopia = nodocopia.nodossiguiente;
        }
        return false;
    }*/

    public void eliminarCancion (int idCancion){
        if (primerNodo == null){
            System.out.println("No tiene elemento para eliminar");
            return;
        }
        if (primerNodo.codigo == idCancion){
            primerNodo = primerNodo.nodossiguiente;
            System.out.println("Cancion"+ idCancion + "eliminada (era la primera");
            return;
        }
        Nodo nodocopia = primerNodo;
        while (nodocopia.nodossiguiente != null) {
            if (nodocopia.nodossiguiente.codigo == idCancion) {
                nodocopia.nodossiguiente = nodocopia.nodossiguiente.nodossiguiente;
                return;
            }
            nodocopia = nodocopia.nodossiguiente;
        }
        System.out.println("Cancion" + idCancion + "no encontrada");
    }

    public void mostrarCancion (){
        if (primerNodo == null){
            System.out.println("No hay canciones en la lista");
            return;
        }
        Nodo nodocopia = primerNodo;
        System.out.println("Lista de canciones:");
        while (nodocopia != null) {
            System.out.println("-> " + nodocopia.codigo);
            nodocopia =  nodocopia.nodossiguiente;
        }
        System.out.println("Fin de la lista");
    }

    
}