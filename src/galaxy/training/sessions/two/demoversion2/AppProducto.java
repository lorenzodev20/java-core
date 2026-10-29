package galaxy.training.sessions.two.demoversion2;

import java.util.ArrayList;
import java.util.List;

public class AppProducto {

    static void main(String[] args) {
        Producto producto=new Producto();
        producto.setCodigo("P002");
        System.out.println("Código: "+producto.getCodigo());
        producto.setNombre("Producto 1");
        System.out.println("Nombre: "+producto.getNombre());
        producto.setPrecioCompra(10000000.0);
        System.out.println("Precio Compra: "+producto.getPrecioCompra());
        producto.setPrecioVenta(150.0);
        System.out.println("Precio Venta: "+producto.getPrecioVenta());
        producto.setDescripcion("Producto de prueba");
        System.out.println("Descripción: "+producto.getDescripcion());

        System.out.println(producto);
        //Array de objetos Producto
        //Producto[] productos;

        // Java Collections Framework (JCF)
        List<Producto> productos = new ArrayList<>();

    }
}
