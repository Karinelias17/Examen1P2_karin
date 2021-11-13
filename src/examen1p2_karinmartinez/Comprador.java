
package examen1p2_karinmartinez;
import java.util.ArrayList;

public class Comprador extends Usuarios{
    public ArrayList <Videojuegos> comprado;
    public int dinero, cuenta,saldo;
    public String personaje;

    public Comprador() {
        super();
    }

    public Comprador(ArrayList<Videojuegos> comprado, int dinero, int cuenta, String personaje,int saldo, String nombre, String usuario, String contraseña, int edad) {
        super(nombre, usuario, contraseña, edad);
        this.comprado = comprado;
        this.dinero = dinero;
        this.cuenta = cuenta;
        this.personaje = personaje;
        this.saldo=saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public ArrayList<Videojuegos> getComprado() {
        return comprado;
    }

    public void setComprado(ArrayList<Videojuegos> comprado) {
        this.comprado = comprado;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Comprador{" + "comprado=" + comprado + ", dinero=" + dinero + ", cuenta=" + cuenta + ", personaje=" + personaje + '}';
    }
    
    
}
