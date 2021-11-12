
package examen1p2_karinmartinez;

public class Usuarios {
    public String nombre, usuario, contraseña;
    public int edad;

    public Usuarios() {
    }

    public Usuarios(String nombre, String usuario, String contraseña, int edad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", edad=" + edad + '}';
    }
    
    
}
