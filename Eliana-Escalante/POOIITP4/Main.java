public class Main {
    public static void main(String[] args) {

        // ===== EJERCICIO 1: Árbol de enteros =====
        NodoBinario<Integer> n8 = new NodoBinario<>(8);
        NodoBinario<Integer> n3 = new NodoBinario<>(3);
        NodoBinario<Integer> n6 = new NodoBinario<>(6);
        NodoBinario<Integer> n9 = new NodoBinario<>(9);
        NodoBinario<Integer> n1 = new NodoBinario<>(1);
        NodoBinario<Integer> n4 = new NodoBinario<>(4);

        n8.setIzquierdo(n3);  n8.setDerecho(n6);
        n3.setIzquierdo(n9);  n3.setDerecho(n1);
        n6.setDerecho(n4);

        System.out.println("=== Ejercicio 1 ===");
        System.out.println("Suma: " + sumar(n8));
        System.out.println("Cantidad de hojas: " + contarHojas(n8));
        System.out.println("Mayor: " + mayor(n8));

        // ===== EJERCICIO 2: Árbol binario ordenado =====
        NodoBinario<Integer> raiz = null;
        raiz = insertar(raiz, 50);
        raiz = insertar(raiz, 30);
        raiz = insertar(raiz, 70);
        raiz = insertar(raiz, 20);
        raiz = insertar(raiz, 40);
        raiz = insertar(raiz, 60);

        System.out.println("=== Ejercicio 2 ===");
        System.out.println("¿Está el 40? " + buscar(raiz, 40));
        System.out.println("¿Está el 99? " + buscar(raiz, 99));
        System.out.println("Mínimo: " + minimo(raiz));
    }

    // ---------- Ejercicio 1 ----------

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
        int max = n.getDato();
        if (n.getIzquierdo() != null) {
            max = Math.max(max, mayor(n.getIzquierdo()));
        }
        if (n.getDerecho() != null) {
            max = Math.max(max, mayor(n.getDerecho()));
        }
        return max;
    }

    // ---------- Ejercicio 2 ----------

    // Inserta un valor y devuelve la raíz. Si ya existe, no lo agrega
    static NodoBinario<Integer> insertar(NodoBinario<Integer> n, int valor) {
        if (n == null) return new NodoBinario<>(valor);
        if (valor < n.getDato()) {
            n.setIzquierdo(insertar(n.getIzquierdo(), valor));
        } else if (valor > n.getDato()) {
            n.setDerecho(insertar(n.getDerecho(), valor));
        }
        return n;
    }

    // Devuelve true si el valor está en el árbol
    static boolean buscar(NodoBinario<Integer> n, int valor) {
        if (n == null) return false;
        if (valor == n.getDato()) return true;
        if (valor < n.getDato()) return buscar(n.getIzquierdo(), valor);
        return buscar(n.getDerecho(), valor);
    }

    // Devuelve el menor valor del árbol
    static int minimo(NodoBinario<Integer> n) {
        if (n.getIzquierdo() == null) return n.getDato();
        return minimo(n.getIzquierdo());
    }
}