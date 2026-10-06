public class Main {
    public static void main(String[] args) {
        Lista_Simple LsSimple = new Lista_Simple();
        LsSimple.agregar_producto(7894);
        LsSimple.agregar_producto(7123);
        LsSimple.agregar_producto(1234);
        LsSimple.agregar_producto(4567);
        
        int codigoBuscado = 7894;

        if (LsSimple.buscar(codigoBuscado)){
            System.out.println("El producto con el código " + codigoBuscado + " está disponible.");
        } else {
            System.out.println("El producto con el código " + codigoBuscado + " no está disponible.");
        }
    }
}

