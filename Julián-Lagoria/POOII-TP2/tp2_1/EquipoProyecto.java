public class EquipoProyecto {

    private Nodo cabeza;
    private int cantidadTotal;

    public EquipoProyecto() {
        this.cabeza = null;
        this.cantidadTotal = 0;
    }

    public boolean agregarMiembro(Persona nuevaPersona) {
        if (buscarDni(nuevaPersona.getDni()) != null) {
            System.out.println(
                "El DNI ya existe en el equipo: " + nuevaPersona.getDni()
            );
            return false;
        }

        Nodo nuevoNodo = new Nodo(nuevaPersona);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        cantidadTotal++;
        System.out.println(
            "Miembro agregado: " +
                nuevaPersona.getNombre() +
                " " +
                nuevaPersona.getApellido()
        );
        return true;
    }

    public boolean eliminarMiembro(String dni) {
        if (cabeza == null) {
            System.out.println("El equipo está vacío.");
            return false;
        }

        if (cabeza.getPersona().getDni().equals(dni)) {
            Persona eliminada = cabeza.getPersona();
            cabeza = cabeza.getSiguiente();
            cantidadTotal--;
            System.out.println(
                "Miembro eliminado: " +
                    eliminada.getNombre() +
                    " " +
                    eliminada.getApellido()
            );
            return true;
        }

        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getPersona().getDni().equals(dni)) {
                Persona eliminada = actual.getSiguiente().getPersona();
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                cantidadTotal--;
                System.out.println(
                    "Miembro eliminado: " +
                        eliminada.getNombre() +
                        " " +
                        eliminada.getApellido()
                );
                return true;
            }
            actual = actual.getSiguiente();
        }

        System.out.println("Miembro no encontrado.");
        return false;
    }

    private Nodo buscarDni(String dni) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getPersona().getDni().equals(dni)) {
                return actual;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public Persona buscarPorDni(String dni) {
        Nodo n = buscarDni(dni);
        return n != null ? n.getPersona() : null;
    }

    public void mostrarEquipo() {
        if (cabeza == null) {
            System.out.println("El equipo no tiene integrantes.");
            return;
        }
        System.out.println(
            "\n--- Integrantes del equipo (" + cantidadTotal + ") ---"
        );
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getPersona());
            actual = actual.getSiguiente();
        }
    }
}
