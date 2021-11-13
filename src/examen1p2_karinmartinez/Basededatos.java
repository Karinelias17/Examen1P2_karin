
package examen1p2_karinmartinez;

import java.util.ArrayList;

public class Basededatos {
    public ArrayList <Usuarios> usuarios =new ArrayList();
    public ArrayList <Videojuegos> comprado=new ArrayList();
    public ArrayList <Videojuegos> vendido=new ArrayList();
    public String ingresado;

    

    public Basededatos() {
    }

    public Basededatos(String ingresado) {
        this.ingresado = ingresado;
    }

    public String getIngresado() {
        return ingresado;
    }

    public void setIngresado(String ingresado) {
        this.ingresado = ingresado;
    }
    
    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Videojuegos> getComprado() {
        return comprado;
    }

    public void setComprado(ArrayList<Videojuegos> comprado) {
        this.comprado = comprado;
    }

    public ArrayList<Videojuegos> getVendido() {
        return vendido;
    }

    public void setVendido(ArrayList<Videojuegos> vendido) {
        this.vendido = vendido;
    }

    @Override
    public String toString() {
        return "Basededatos{" + "usuarios=" + usuarios + ", comprado=" + comprado + ", vendido=" + vendido + '}';
    }
    
    
}
