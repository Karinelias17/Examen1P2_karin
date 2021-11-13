
package examen1p2_karinmartinez;

public class Administrador extends Usuarios{

    public Administrador() {
        super();
    }

    public Administrador(String nombre, String usuario, String contraseña, int edad) {
        super(nombre, usuario, contraseña, edad);
    }
    
    
    @Override
    public String toString() {
        return "Administrador{" + '}';
    }
    
}
