package pe.edu.galaxy.training.java.jd0.app.dimension2;

public class AppD2F {

	public static void main(String[] args) {
	
		String frutas[][]=new String[3][2];

		frutas[0][0]= "Piña";// Nombre
		frutas[0][1]= "2";	//Cantidad
							// Precio
		
		frutas[1][0]= "Naranja";
		frutas[1][1]= "5";
		
		frutas[2][0]= "Uva";
		frutas[2][1]= "5";
		
		for (int i = 0; i < frutas.length; i++) {
			for (int j = 0; j < frutas[i].length; j++) {
				System.out.println(frutas[i][j]);
			}
		}
		System.out.println("Fruta \t cantidad");	

		for (int i = 0; i < frutas.length; i++) {
			for (int j = 0; j < frutas[i].length; j++) {
				if (j==1) {
					System.out.println("\t\t"+frutas[i][j]);	
				}else {
					System.out.print(frutas[i][j]);
				}
				
			}
		}

	}

}
