package galaxy.training.sessions.two.operators.ternario;

public class AppTernarioV3 {

	public static void main(String[] args) {
		
		float nota=19.0F;
		
		if (nota>=10.5) {
			System.out.println("Aprobado");
			if (nota==20) {
				System.out.println("Excelencia");
			} else {
				System.out.println("Aprobado regular");
			}
		} else {
			System.out.println("Desaprobado");
			if (nota<=5) {
				System.out.println("Repite curso");
			} else {
				System.out.println("Examen sustitutorio");
			}
		}
		
		System.out.println((nota>=10.5)?((nota==20)?"Excelencia":"Aprobado regular"):
			((nota<=5)? "Repite curso":"Examen sustitutorio")); // LoC
		
	}
}
