public class Main {
    public static void main(String[] args) {
        NodoBinario<String> n8 = new NodoBinario<>("8");
        NodoBinario<String> n3 = new NodoBinario<>("3");
        NodoBinario<String> n6 = new NodoBinario<>("6");
        NodoBinario<String> n9 = new NodoBinario<>("9");
        NodoBinario<String> n1 = new NodoBinario<>("1");
        NodoBinario<String> n4 = new NodoBinario<>("4");

        // Paso 1: enlazar los nodos para formar el árbol
        n8.setIzquierdo(n3);  n8.setDerecho(n6);
        n3.setIzquierdo(n9);  n3.setDerecho(n1);
        n6.setDerecho(n4);

        // Paso 2: consultar el árbol
        System.out.println("Raíz: " + n8.getDato());
        System.out.println("Hijo izquierdo de 8: " + n3.getIzquierdo().getDato());
        System.out.println("Hijo derecho de 3: " + n9.getDerecho().getDato());
        System.out.println("Hijo izquierdo de 3: " + n1.getIzquierdo().getDato());
        System.out.println("Hijo derecho de 8: " + n6.getDerecho().getDato());
        System.out.println("Hijo derecho de 6: " + n4.getDerecho().getDato());

        // Paso 3: método recursivo
        System.out.println("Cantidad de nodos: " + sumar(n8));
        //Muestro cantidad de Hojas
        System.out.println("Cantidad de hojas: " + contarHojas(n8));
        //Se muestra el mayor
       //System.out.println("Cantidad de hojas: " + mayor(n8));
    }

    static <T> int sumar(NodoBinario<T> n) {
        if (n == null) return 0;                                       // caso base
        return 1 + sumar(n.getIzquierdo()) + sumar(n.getDerecho());
    }

        //Paso 4: Metodo para contar Hojas

    static <T> int contarHojas(NodoBinario<T> n){
        if (n == null) return
        0;

        return 1 + contarHojas(n.getIzquierdo()) + contarHojas(n.getDerecho());
    }

        //Paso 5: Metodo para mostrar el mayor
   // static <T> int mayor (NodoBinario<T> n){
     //   if (n == null) return Integer.MIN.VALUE;

     //   int izquierdo = mayor(n.getIzquierdo());
     //   int derecho = mayor(n.getDerecho());

     //   return Math.max(n.getDato(), Math.max(izquierdo,derecho));
    //}
}
