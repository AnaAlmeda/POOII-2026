package tp1_3;

public class Nodo {

    int idCancion;
    String nombreCancion;
    Nodo nodosiguiente;

    public Nodo(int idCancion, String nombreCancion) {
        this.idCancion = idCancion;
        this.nombreCancion = nombreCancion;
        this.nodosiguiente = null;
    }
}
