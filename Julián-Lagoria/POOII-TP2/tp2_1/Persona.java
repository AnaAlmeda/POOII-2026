public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String rol;

    public Persona(
        String dni,
        String nombre,
        String apellido,
        int edad,
        String rol
    ) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rol = rol;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getRol() {
        return rol;
    }

    @Override
    public String toString() {
        return (
            "DNI: " +
            dni +
            " | Nombre: " +
            nombre +
            " " +
            apellido +
            " | Edad: " +
            edad +
            " | Rol: " +
            rol
        );
    }
}
