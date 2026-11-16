package galaxy.training.sessions.session02.operators.logicos;

public class AppLogico {

	public static void main(String[] args) {
		// and: &, &&, or: | || negation: !

		int edad=17;
		char genero='F';
		
		// Hombres
		System.out.println("Ciudadano: "+ (edad>=18 & genero=='M'));
		System.out.println("Ciudadano: "+ (edad>=18 && genero=='M'));
		
		edad=18;
		genero='F';
		System.out.println("Ciudadano: "+ (edad>=18 | genero=='M'));
		System.out.println("Ciudadano: "+ (edad>=18 || genero=='M'));
		
		// Hombres
		System.out.println("Ciudadano: "+ !(edad>=18 & genero=='M'));
	}

}
