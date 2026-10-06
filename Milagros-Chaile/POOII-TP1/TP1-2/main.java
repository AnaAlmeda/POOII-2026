public class main {
    public static void main(String[] args) {
        ListaSimple lSimple = new ListaSimple();
        lSimple.agregar_producto(151);
        lSimple.agregar_producto(165);
        lSimple.agregar_producto(20);
        lSimple.agregar_producto(15372);
        lSimple.mostrar_producto();

        if (lSimple.buscar_producto(20)) {
                System.out.println("El dato fue encontrado");
            } else {
                System.out.println("El dato no fue encontrado");
            }
    }
}