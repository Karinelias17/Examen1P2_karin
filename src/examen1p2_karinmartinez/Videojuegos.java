
package examen1p2_karinmartinez;

public class Videojuegos {
    public String nombre;
    public int lanzamiento,cantidad,precio;

    public Videojuegos() {
    }

    public Videojuegos(String nombre, int lanzamiento, int cantidad, int precio) {
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Videojuegos{" + "nombre=" + nombre + ", lanzamiento=" + lanzamiento + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    
}
