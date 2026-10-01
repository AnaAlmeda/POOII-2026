public class main {
    public static void main(String[] args) {
        ListaSimple stockProductos = new ListaSimple();
        stockProductos.agregar(1010);
        stockProductos.agregar(2055);
        stockProductos.agregar(3000);
        stockProductos.agregar(4125);
        
        int articuloBuscar = 3000;

        boolean estaDisponible = stockProductos.buscar(articuloBuscar);

        if (estaDisponible){
            System.out.print("El producto " + articuloBuscar + " Si está disponible");
        } else {
            System.out.print("El producto " + articuloBuscar + " No está disponible");
        }

        int articuloBuscar2 = 9999;
        if(stockProductos.buscar(articuloBuscar2)){
            System.out.println("El producto " + articuloBuscar2 + " Si está disponible");
        } else {
            System.out.println("El producto " + articuloBuscar2 + " No está disponible");
        }
    }
}