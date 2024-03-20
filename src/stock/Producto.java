package stock;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    // Metodo constructor donde definimos el nombre, el precio y la cantidad del producto
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Mostramos en consola toda la informacion del producto
    public void mostrar () {
        System.out.println("El producto es: "+this.nombre+", vale: " +this.precio +", y quedan: "+this.cantidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
