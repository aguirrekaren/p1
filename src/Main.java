import stock.Producto;
import stock.Stock;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos una instancia de la clase Stock
        Stock stock = new Stock();

        // Creamos una instancia de la clase Producto
        Producto avena = new Producto("Avena", 20000, 3);
        Producto chocolate = new Producto("Chocolate", 15000, 4);
        Producto canela = new Producto("Canela", 5000, 2);
        Producto arroz = new Producto("Arroz", 30000, 1);

        // Agregamos productos al stock
        stock.agregar(avena);
        stock.agregar(chocolate);
        stock.agregar(canela);
        stock.agregar(arroz);

        System.out.println(stock.getProductos());

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        stock.eliminar(nombre);
        stock.getInfo(nombre);
    }
}