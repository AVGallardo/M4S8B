package modelo;

import java.util.ArrayList;
import java.util.List;

public class CarroDeCompras {
    private List<Producto> productos;

    public CarroDeCompras() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (productos.size() < 10) {
            productos.add(producto);
            System.out.println("Producto agregado al carrito: " + producto.getNombre());
        } else {
            System.out.println("Carro de compras lleno. No puedes agregar más de 10 productos.");
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }
}
