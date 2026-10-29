package galaxy.training.sessions.two.demoversion2;

public class AppProductoNacional {

    static void main(String[] args) {
        ProductoNacional productoNacional = new ProductoNacional("P001", "Producto Nacional 1", "Descripción del producto nacional 1", 100.0, 10);
        System.out.println("Código: " + productoNacional.codigo());
        System.out.println("Nombre: " + productoNacional.nombre());
        System.out.println("Descripción: " + productoNacional.descripcion());
        System.out.println("Precio: " + productoNacional.precio());
        System.out.println("Stock: " + productoNacional.stock());
    }
}
