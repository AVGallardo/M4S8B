package principal;

import modelo.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto[] productos = {
                new Vegetal("Lechuga", "V001", 1000, LocalDate.now(), LocalDate.now().plusDays(7)),
                new Vegetal("Tomate", "V002", 1500, LocalDate.now(), LocalDate.now().plusDays(5)),
                new Vestuario("Polera", "R001", 5000, "M", "Azul"),
                new Vestuario("Pantalón", "R002", 10000, "L", "Negro")
        };

        // Crear vendedor
        Vendedor vendedor = new Vendedor("Juan Pérez", "12345678-9");

        // Crear carrito de compras
        CarroDeCompras carrito = new CarroDeCompras();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su rut: ");
        String rut = scanner.nextLine();
        System.out.println("Bienvenide " + nombre );

        do {
            System.out.println("---- MENÚ ----");
            System.out.println("1. Listar productos disponibles");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Listar productos en el carrito");
            System.out.println("4. Pagar");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nProductos disponibles:");
                    for (Producto producto : productos) {
                        System.out.println(producto);
                    }
                    break;
                case 2:
                    System.out.print("\nIngresa el código del producto a agregar: ");
                    String codigo = scanner.next();
                    boolean encontrado = false;
                    for (Producto producto : productos) {
                        if (producto.getCodigo().equals(codigo)) {
                            carrito.agregarProducto(producto);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("\nProductos en el carrito:");
                    carrito.listarProductos();
                    break;
                case 4:
                    double total = carrito.calcularTotal();
                    System.out.println("\nTotal a pagar: $" + total);
                    System.out.println("Vendedor: " + vendedor);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}
