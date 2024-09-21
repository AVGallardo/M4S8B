package modelo;

public class Venta {
    private Vendedor vendedor;
    private double ganancia;

    public Venta() {
    }

    public Venta(Vendedor vendedor, double ganancia) {
        this.vendedor = vendedor;
        this.ganancia = ganancia;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "vendedor=" + vendedor +
                ", ganancia=" + ganancia +
                '}';
    }
}
