class Nodo {

    int dato;
    Nodo siguiente;

    // El constructor recibe el dato
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null; // puntero
    }
}

public class listas {

    public static void main(String[] args) {

        Nodo nodo1 = new Nodo(10);
        Nodo nodo2 = new Nodo(20);
        Nodo nodo3 = new Nodo(30);

        nodo1.siguiente = nodo2;
        nodo2.siguiente = nodo3;

        System.out.println(nodo1.dato);
        System.out.println(nodo1.siguiente.dato);
        System.out.println(nodo1.siguiente.siguiente.dato);
    }
}