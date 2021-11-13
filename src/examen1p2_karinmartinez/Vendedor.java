
package examen1p2_karinmartinez;

import java.util.ArrayList;

public class Vendedor extends Usuarios{
    public int estrellas, cuenta, dinero,saldo;
    public ArrayList <Videojuegos> vendido;
    public String personaje;

    public Vendedor() {
        super();
    }
    
    public Vendedor(int estrellas, int cuenta, int dinero, ArrayList<Videojuegos> vendido, String personaje,int saldo, String nombre, String usuario, String contraseña, int edad) {
        super(nombre, usuario, contraseña, edad);
        this.estrellas = estrellas;
        this.cuenta = cuenta;
        this.dinero = dinero;
        this.vendido = vendido;
        this.personaje = personaje;
        this.saldo =saldo;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Videojuegos> getVendido() {
        return vendido;
    }

    public void setVendido(ArrayList<Videojuegos> vendido) {
        this.vendido = vendido;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    
    @Override
    public String toString() {
        return "Vendedor{" + "estrellas=" + estrellas + ", cuenta=" + cuenta + ", dinero=" + dinero + ", vendido=" + vendido + ", personaje=" + personaje + '}';
    }
    
}
