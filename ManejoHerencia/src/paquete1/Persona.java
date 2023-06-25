package paquete1;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected String usuario;
// Se creó variables de uso ".this" de lo contrario los datos solo se presentaban en null

    public Persona(String nombre, String apellido, String usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public void establecerUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "\nPersona\n"
                + "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "Usuario: " + usuario + "\n";
    }
}
