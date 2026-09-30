/*   Ejercicio 2: Sistema de Control de Stock (Búsqueda de Productos)
Contexto: Un pequeño depósito necesita registrar los códigos de los productos que van ingresando para poder consultar rápidamente si un artículo se encuentra disponible.

Consigna:

Utiliza la estructura base de Nodo (con un atributo int codigo en lugar de turno) y ListaSimple.

Implementa el método agregar(int codigo) para insertar nuevos códigos al final de la lista.

Implementa un método boolean buscar(int codigoBuscado) que recorra la lista desde la cabeza y retorne true si el código existe o false en caso contrario.

Crea una clase Main que cargue al menos 4 códigos de productos y compruebe el funcionamiento del buscador imprimiendo un mensaje claro por pantalla.//
*/

public class Nodo {

    int codigo;
    Nodo nodosiguiente;

    public Nodo(int codigo) {
        this.codigo = codigo;
        this.nodosiguiente = null;
    }
}