public class Main1 {
    public static void main(String[] args) {
       codigo Codigo = new codigo();
       Codigo.agregar(101);
       Codigo.agregar(205);
       Codigo.agregar(310);
       Codigo.agregar(204);


       boolean resultado = Codigo.buscar(666);

       System.out.println("Codigo encontrado: " + resultado);
       




       
    }
}


