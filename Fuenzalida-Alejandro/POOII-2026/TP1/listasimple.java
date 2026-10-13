package objeto2.alejandro_fuenzalida.TP1;

public class listasimple {
    nodo primernodo;

    public listasimple(){
        primernodo = null;
    }

    public void agregar(int dato){
        nodo nuevodato = new nodo(dato);

        if (primernodo == null){
            primernodo = nuevodato;
        }else{
            nodo nodocopia = primernodo;
            while(nodocopia.siguiente != null){
                nodocopia = nodocopia.siguiente;
            }
            nodocopia.siguiente = nuevodato;
        }
    }


public void mostrar() {

    if (primernodo == null) {
        System.out.println("No tiene elementos para mostrar");
        return;
    }

    nodo nodocopia = primernodo;

    while (nodocopia != null) {
        System.out.println("Dato guardado: " + nodocopia.dato);
        nodocopia = nodocopia.siguiente;
    }
}
}