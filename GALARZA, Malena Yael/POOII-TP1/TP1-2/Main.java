public class Main {
    public static void main(String[] args){
        ListasSimples lSimple = new ListasSimples();
        lSimple.agregar_producto(7987654); 
        lSimple.agregar_producto(6546789);
        lSimple.agregar_producto(9876566);
        lSimple.agregar_producto(9777777);
        lSimple.mostrar_producto();
        int codigoBuscado = 7987654;
        if(lSimple.buscar(codigoBuscado)){
            System.out.println("El codigo " + codigoBuscado + " esta disponible.");
        } else {
            System.out.println("El codigo " + codigoBuscado + " NO esta disponible.");
        }

        codigoBuscado = 5555;
        if(lSimple.buscar(codigoBuscado)){
            System.out.println("El codigo " + codigoBuscado + " esta disponible.");
        } else {
            System.out.println("El codigo " + codigoBuscado + " NO esta disponible.");
        }
    }
}