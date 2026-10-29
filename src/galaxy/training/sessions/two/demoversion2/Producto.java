package galaxy.training.sessions.two.demoversion2;

public class Producto{

    private final Double PRECIO_COMPRA_MINIMO=0D;
    private final Double PRECIO_COMPRA_MAXIMO=1_000_000D;

   private String codigo;
   private String nombre;
   private String descripcion;
   private Double precioCompra;
   private Double precioVenta;

   // Setter y Getter
   public void setCodigo(String codigo){
       this.codigo=codigo;
   }

   public String getCodigo(){
         return this.codigo;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
       if(precioCompra < PRECIO_COMPRA_MINIMO){
           throw new IllegalArgumentException("El precio de compra no puede ser negativo");
       }
       if (precioCompra > PRECIO_COMPRA_MAXIMO) {
           throw new IllegalArgumentException("El precio de compra no puede ser mayor a 1,000,000");
       }
       this.precioCompra = precioCompra;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioCompra=" + precioCompra +
                ", precioVenta=" + precioVenta +
                '}';
    }
}