package pe.edu.galaxy.training.java.jd0.app.dimension1;

public class AppD3F {

	public static void main(String[] args) {

		//1.- Declaración

		String[] frutas;

		int dias[];


		//2.- Instanciación (new)

		frutas = new String[6]; // reserva


		//3.- Inicailización

		frutas[0] = "Piña";
		frutas[1] = "Naranja";
		/*frutas[2]= "Uva";
		frutas[3]= "Fresa";	
		frutas[4]= "Platano";*/
		frutas[5]= "Pera";

		System.out.println("Length -> " + frutas.length);

		System.out.println(frutas[4]);
		// 4.- Recorrido
		// Primitiva- Dino
		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
		}


		System.out.println("for each....");

		for (String f : frutas) {
			System.out.println(f);
		}
		System.out.println("-------------------");
		if (frutas.length >= 6){
			System.out.println(frutas[5]);
		}

		try{
			System.out.println(frutas[5]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.err.println("Posición no válida");
		}

		/*
		try {
			if (frutas.length>=11) {
				System.out.println(frutas[10]);
			}else {
				System.err.println("Posición no válida");
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}*/
		
		
		
		
	}

}
