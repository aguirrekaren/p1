package stock;

import java.util.ArrayList;

public class Stock {

    // Creamos una lista de objetos de la clase Producto
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    // Este metodo retorna todos los productos
    public ArrayList<String> getProductos () {

        // definimos una lista de strings donde guardaremos los nombres
        ArrayList<String> nombres = new ArrayList<String>();

        for (int i = 0; i < productos.size(); i++) {
            String nombre = productos.get(i).getNombre();
            nombres.add(nombre);
        }
        return nombres;
    }

    public void getInfo (String nombreProducto) {
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if (nombreProducto.equals(producto.getNombre())){
                producto.mostrar();
            }

        }
    }

    // Agrega el producto a la lista de productos
    public void agregar (Producto producto) {
        productos.add(producto);
    }

    // Resta el stock del producto solicitado
    public void eliminar (String nombreProducto) {
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if (nombreProducto.equals(producto.getNombre())) {
                int cantidad = producto.getCantidad();
                if (cantidad > 0) {
                    producto.setCantidad(cantidad - 1);
                } else {
                    System.out.println("No hay stock de "+producto.getNombre());
                }
            }
        }
    }
}
