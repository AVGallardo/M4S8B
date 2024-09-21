package modelo;

import java.time.LocalDate;

public class Vegetal extends Producto {
    private LocalDate fechaEnvasado;
    private LocalDate fechaCaducidad;

    public Vegetal() {
    }

    public Vegetal(String nombre, String codigo, double precio, LocalDate fechaEnvasado, LocalDate fechaCaducidad) {
        super(nombre, codigo, precio);
        this.fechaEnvasado = fechaEnvasado;
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Vegetal{" +
                "nombre='" + getNombre() + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", precio=" + getPrecio() +
                ", fechaEnvasado=" + fechaEnvasado +
                ", fechaCaducidad=" + fechaCaducidad +
                '}';
    }
}

