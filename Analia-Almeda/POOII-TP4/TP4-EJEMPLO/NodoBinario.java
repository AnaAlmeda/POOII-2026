public class NodoBinario<T> {
    private T dato;
    private NodoBinario<T> izquierdo;
    private NodoBinario<T> derecho;

    public NodoBinario(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoBinario<T> getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoBinario<T> izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoBinario<T> getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoBinario<T> derecho) {
        this.derecho = derecho;
    }
}