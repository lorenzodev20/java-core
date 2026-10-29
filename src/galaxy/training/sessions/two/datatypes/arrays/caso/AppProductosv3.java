package pe.edu.galaxy.training.java.jd0.app.caso;

public class AppProductosv3 {

	public static void main(String[] args) {
		
		Object[][] productos= {
								{new Producto(1L, "Producto 1",150.00, 2),"A"},
								{new Producto(2L, "Producto 2",256.00, 5),"I"},		
								{new Producto(3L, "Producto 3",45.00, 20),"A"},
								{new Producto(4L, "Producto 4",200.00, 4),"A"}
								};
				
		Double total=0.0;
		
		try {
			for (int i = 0; i < productos.length; i++) {
				for (int j = 0; j < productos[0].length; j++) {
					if (j==0) {
						System.out.println(productos[i][0]);
						total+=((Producto)productos[i][0]).total();
					}
					
				}
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		System.out.println("Total => "+total);
	}
}
