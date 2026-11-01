public  class Main {
    public static void main(String[] args) {
        NodoBinario<Integer> a = new NodoBinario<>(8);
        NodoBinario<Integer> b = new NodoBinario<>(3);
        NodoBinario<Integer> c = new NodoBinario<>(9);
        NodoBinario<Integer> d = new NodoBinario<>(6);
        NodoBinario<Integer> e = new NodoBinario<>(1);
        NodoBinario<Integer> f = new NodoBinario<>(4);

        // Paso 1: enlazar los nodos para formar el árbol
        a.setIzquierdo(b);  a.setDerecho(d);
        b.setIzquierdo(c);  b.setDerecho(e);
        d.setDerecho(f);

        // Paso 2: consultar el árbol
        System.out.println("Raíz: " + a.getDato());
        System.out.println("Hijo izquierdo de A: " + a.getIzquierdo().getDato());
        System.out.println("Hijo derecho de d: " + d.getDerecho().getDato());

        // Paso 3: método recursivo
           System.out.println("Suma: " + sumar(a));
        System.out.println("Hojas: " + contarHojas(a));
        System.out.println("Mayor: " + mayor(a));
     }
    static int sumar(NodoBinario<Integer> n) {
        if (n == null) return 0;
        return n.getDato() + sumar(n.getIzquierdo()) + sumar(n.getDerecho());
    }

    static int contarHojas(NodoBinario<Integer> n) {
        if (n == null) return 0;
        if (n.getIzquierdo() == null && n.getDerecho() == null) return 1;
        return contarHojas(n.getIzquierdo()) + contarHojas(n.getDerecho());
    }

    static int mayor(NodoBinario<Integer> n) {
        if (n == null) return Integer.MIN_VALUE;
        int max = n.getDato();
        max = Math.max(max, mayor(n.getIzquierdo()));
        max = Math.max(max, mayor(n.getDerecho()));
        return max;
    }
}

   