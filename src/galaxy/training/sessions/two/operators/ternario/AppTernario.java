package galaxy.training.sessions.two.operators.ternario;

public class AppTernario {

	public static void main(String[] args) {
		
		float nota=10.5f;
		
		if (nota>=10.5) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Desaprobado");
		}
		
		System.out.println((nota>=10.5)?"Aprobado":"Desaprobado");
		
	}
}
