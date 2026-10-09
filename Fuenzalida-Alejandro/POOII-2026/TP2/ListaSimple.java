package objeto2.alejandro_fuenzalida.TP2;

public class ListaSimple {

	

	    Nodo primerNodo;

	    public ListaSimple() {
	        primerNodo = null;
	    }

	    // AGREGAR CODIGO AL FINAL DE LA LISTA
	    public void agregar(int codigo) {

	        Nodo nuevodato = new Nodo(codigo);

	        if (primerNodo == null) {

	            primerNodo = nuevodato;

	        } else {

	            Nodo nodocopia = primerNodo;

	            while (nodocopia.nodosiguiente != null) {
	                nodocopia = nodocopia.nodosiguiente;
	            }

	            nodocopia.nodosiguiente = nuevodato;
	        }
	    }

	    // BUSCAR CODIGO EN LA LISTA
	    public boolean buscar(int codigoBuscado) {

	        Nodo nodocopia = primerNodo;

	        while (nodocopia != null) {

	            if (nodocopia.codigo == codigoBuscado) {
	                return true;
	            }

	            nodocopia = nodocopia.nodosiguiente;
	        }

	        return false;
	    }
	}
	

