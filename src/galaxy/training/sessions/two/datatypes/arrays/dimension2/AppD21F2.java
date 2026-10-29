package pe.edu.galaxy.training.java.jd0.app.dimension2;

public class AppD21F2 {

	public static void main(String[] args) {
	
		String frutas[][]= {
								{"Piña","2","F"},
								{"Naranja","5","R"},
								{"Uva","5","F"},
							};

		for (int i = 0; i < frutas.length; i++) {
			for (int j = 0; j < frutas[i].length; j++) {
				if (j==1 || j==2) {
					System.out.print("\t"+frutas[i][j]);
					if (j==2) {
						System.out.println();
					}
				}else {
					System.out.print(frutas[i][j]);
				}
				
			}
		}

	}

}
