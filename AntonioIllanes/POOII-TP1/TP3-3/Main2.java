public class Main2 {
    public static void main(String[] args) {
        ListaCancion cancion = new ListaCancion();
        cancion.agregar(8994);
        cancion.agregar(2601);
        cancion.agregar(2906);
    
        cancion.mostrar(); 

        System.out.println("Estado actualizado de las canciones");
        
        cancion.eliminar(2601);
        cancion.mostrar();
    }
}


