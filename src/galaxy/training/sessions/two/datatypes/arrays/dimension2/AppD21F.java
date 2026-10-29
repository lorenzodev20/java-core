package pe.edu.galaxy.training.java.jd0.app.dimension2;

public class AppD21F {

	public static void main(String[] args) {
	
		String frutas[][]= {
								{"Piña","2"},
								{"Naranja","5"},
								{"Uva","5"},
							};

		for (int i = 0; i < frutas.length; i++) {
			for (int j = 0; j < frutas[i].length; j++) {
				if (j==1) {
					System.out.println("\t"+frutas[i][j]);
				}else {
					System.out.print(frutas[i][j]);
				}
				
			}
		}

	}

}
