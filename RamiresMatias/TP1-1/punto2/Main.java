public class Main {
    public static void main(String[] args) {
    
        ListaSimple stock = new ListaSimple();

    
        stock.agregar(1015);
        stock.agregar(2042);
        stock.agregar(3091);
        stock.agregar(4010);

        System.out.println("SISTEMA DE CONTROL DE STOCK ");
        System.out.println("Productos cargados exitosamente en el sistema.\n");

    
        int codigoBuscado1 = 3091;
        System.out.println("Buscando el producto con código: " + codigoBuscado1);
        if (stock.buscar(codigoBuscado1)) {
            System.out.println(" Resultado: ¡Disponible! El artículo se encuentra en el depósito.\n");
        } else {
            System.out.println(" Resultado: No disponible.\n");
        }

    
        int codigoBuscado2 = 9999;
        System.out.println("Buscando el producto con código: " + codigoBuscado2);
        if (stock.buscar(codigoBuscado2)) {
            System.out.println(" Resultado: ¡Disponible! El artículo se encuentra en el depósito.\n");
        } else {
            System.out.println(" Resultado: No disponible. El código ingresado no existe en el inventario.\n");
        }
    }
}