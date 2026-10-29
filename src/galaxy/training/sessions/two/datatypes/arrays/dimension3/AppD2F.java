package pe.edu.galaxy.training.java.jd0.app.dimension3;

public class AppD2F {

	public static void main(String[] args) {
	
		String frutas[][][]=new String[3][2][2];

		frutas[0][0][0]= "Piña";
		frutas[0][0][1]= "2";
		frutas[0][1][0]= "F";

		System.out.println(frutas[0][0][0] + " - " + frutas[0][0][1] + " - " + frutas[0][1][0]);
	}

}
