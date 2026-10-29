public class Main {
    public static void main(String[] args) {
        NodoBinario<String> a = new NodoBinario<>("A");
        NodoBinario<String> b = new NodoBinario<>("B");
        NodoBinario<String> c = new NodoBinario<>("C");
        NodoBinario<String> d = new NodoBinario<>("D");
        NodoBinario<String> e = new NodoBinario<>("E");
        NodoBinario<String> f = new NodoBinario<>("F");

        // Paso 1: enlazar los nodos para formar el árbol
        a.setIzquierdo(b);  a.setDerecho(c);
        b.setIzquierdo(d);  b.setDerecho(e);
        c.setDerecho(f);

        // Paso 2: consultar el árbol
        System.out.println("Raíz: " + a.getDato());
        System.out.println("Hijo izquierdo de A: " + a.getIzquierdo().getDato());
        System.out.println("Hijo derecho de C: " + c.getDerecho().getDato());

        // Paso 3: método recursivo
        System.out.println("Cantidad de nodos: " + contar(a));
    }

    static <T> int contar(NodoBinario<T> n) {
        if (n == null) return 0;                                       // caso base
        return 1 + contar(n.getIzquierdo()) + contar(n.getDerecho());
    }
}