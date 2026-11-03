public class Main {
    public static void main(String[] args) {

        // Consigna 1: armar el árbol enlazando los nodos con los setters
        NodoBinario<Integer> n8 = new NodoBinario<>(8);
        NodoBinario<Integer> n3 = new NodoBinario<>(3);
        NodoBinario<Integer> n6 = new NodoBinario<>(6);
        NodoBinario<Integer> n9 = new NodoBinario<>(9);
        NodoBinario<Integer> n1 = new NodoBinario<>(1);
        NodoBinario<Integer> n4 = new NodoBinario<>(4);

        n8.setIzquierdo(n3);  n8.setDerecho(n6);
        n3.setIzquierdo(n9);  n3.setDerecho(n1);
        n6.setDerecho(n4);

        System.out.println("Suma: " + sumar(n8));
        System.out.println("Cantidad de hojas: " + contarHojas(n8));
        System.out.println("Mayor: " + mayor(n8));
    }

    // Consigna 2: suma de todos los datos
    static int sumar(NodoBinario<Integer> n) {
        if (n == null) return 0;
        return n.getDato() + sumar(n.getIzquierdo()) + sumar(n.getDerecho());
    }

    // Consigna 3: cantidad de hojas (nodos sin hijos)
    static int contarHojas(NodoBinario<Integer> n) {
        if (n == null) return 0;
        if (n.getIzquierdo() == null && n.getDerecho() == null) return 1;
        return contarHojas(n.getIzquierdo()) + contarHojas(n.getDerecho());
    }

    // Consigna 4: valor más grande del árbol
    static int mayor(NodoBinario<Integer> n) {
        int max = n.getDato();
        if (n.getIzquierdo() != null) {
            max = Math.max(max, mayor(n.getIzquierdo()));
        }
        if (n.getDerecho() != null) {
            max = Math.max(max, mayor(n.getDerecho()));
        }
        return max;
    }
}