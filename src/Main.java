import stock.Producto;
import stock.Stock;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creamos una instancia de la clase Stock
        Stock stock = new Stock();

        // Creamos una instancia de la clase Producto
        Producto avena = new Producto("Avena", 20000, 0);

        // Agregamos un producto al stock
        stock.agregar(avena);

        avena.mostrar();

        stock.eliminar("Avena");

        avena.mostrar();
    }
}