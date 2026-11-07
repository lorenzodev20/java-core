package galaxy.training.sessions.five.productoPoo;

public class AppProducto {
    static void main(String[] args) {

        Producto producto = new Producto();
        producto.setCodigo(100L);
        producto.setNombre("Producto 1");
        System.out.println(producto.getCodigo());

        Producto producto1 = new Producto(100L, "Producto 1");

        Producto producto2 = new Producto(102L, "Producto 2", 300.0, 10);

        System.out.println(producto);

        System.out.println(producto1);

        System.out.println(producto2);

        System.out.println(producto.equals(producto1));
        System.out.println(producto.hashCode());
        System.out.println(producto2.hashCode());
    }
}
