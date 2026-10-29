package pe.edu.galaxy.training.java.jd0.app.caso;

public class AppProductos {

	public static void main(String[] args) {
		
		Producto[] productos=new Producto[3];
		
		productos[0]= new Producto(1L, "Producto 1",150.00, 2);
		productos[1]= new Producto(2L, "Producto 2",256.00, 5);		
		productos[2]= new Producto(3L, "Producto 3",45.00, 20);
		
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
