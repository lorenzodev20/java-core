package pe.edu.galaxy.training.java.jd0.app.caso;

public class AppProductosv2 {

	public static void main(String[] args) {
		
		Producto[] productos= {
								new Producto(1L, "Producto 1",150.00, 2),
								new Producto(2L, "Producto 2",256.00, 5),		
								new Producto(3L, "Producto 3",45.00, 20),
								new Producto(4L, "Producto 4",200.00, 4)
								};
		
		Double total=0.0;
		try {
			for (Producto producto : productos) {
				System.out.println(producto);
				total+=producto.total();
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		System.out.println("Total => "+total);
	}
}
