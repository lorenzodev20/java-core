package galaxy.training.sessions.five.productoPoo;

import java.util.Objects;

public class Producto {
    // Atributos (Attributes), Variables, Campos (Fields)
    private Long codigo;
    private String nombre;
    private Double precio;
    private Integer cantidad;

    // Métodos (Methods)

    // Constructores
    public Producto() {
        this.codigo = 0L;
        this.nombre = "";
        this.precio = 0.0;
        this.cantidad = 0;
    }

    public Producto(Long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = 0.0;
        this.cantidad = 0;
    }

    public Producto(Long codigo, String nombre, Double precio, Integer cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }


    // Setters/Getters

    //Set
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    // Get
    public Long getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    // Operacionales
    public Double getTotal() {
        if (this.precio == null || this.cantidad == null) {
            return null;
        }
        return this.precio * this.cantidad;
    }

    // toString

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
    // Equals

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Producto producto)) return false;
        return Objects.equals(getCodigo(), producto.getCodigo())
                && Objects.equals(getNombre(), producto.getNombre())
                && Objects.equals(getPrecio(), producto.getPrecio())
                && Objects.equals(getCantidad(), producto.getCantidad());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(), getNombre(), getPrecio(), getCantidad());
    }
}
