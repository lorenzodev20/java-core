package galaxy.training.sessions.two.operators.ternario;

public class AppTernarioV2 {

	public static void main(String[] args) {
		
		float nota=3.5f;
		
		if (nota>=10.5) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Desaprobado");
			if (nota<=5) {
				System.out.println("Repite curso");
			} else {
				System.out.println("Examen sustitutorio");
			}
		}
		
		System.out.println((nota>=10.5)?"Aprobado":((nota<=5)? "Repite curso":"Examen sustitutorio"));
		
	}
}
