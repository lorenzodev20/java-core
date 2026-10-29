package pe.edu.galaxy.training.java.jd0.app.dimension1;

public class AppD2F {

	public static void main(String[] args) {
		
		//1.- Declaración y Instanciación (new)
		
		String frutas[]=new String[5];
		
		//2.- Inicailización
		
		frutas[0]= "Piña";
		frutas[1]= "Naranja";
		frutas[2]= "Uva";
		frutas[3]= "Fresa";
		frutas[4]= "Platano";
		
		for (String f : frutas) {
			System.out.println(f);
		}
	
	}

}
