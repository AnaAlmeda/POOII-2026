/*Esta clase es llamada desde nodo, recuerden que cada nodo guarda un tipo de objeto Persona */
public class Persona {
    private String dni;
    private String nombre;
    private int edad;
    private String rol;

    public Persona(String dni, String nombre, int edad, String rol) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.rol = rol;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRol() {
        return rol;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " | Nombre: " + nombre + " | Edad: " + edad + " | Rol: " + rol;
    }
}