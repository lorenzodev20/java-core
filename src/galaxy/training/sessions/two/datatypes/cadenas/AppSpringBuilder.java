package galaxy.training.sessions.two.datatypes.cadenas;

public class AppSpringBuilder {

	public static void main(String[] args) {
		
		StringBuilder s= new StringBuilder("Java "); // cl�sica
		
		System.out.println(s);
		
		System.out.println(s.append("11"));
		
		System.out.println(s.insert(5," Web "));
		
		System.out.println(s.replace(5, 9, " Mobil "));
		
		System.out.println(s.delete(5, 12));
		
		System.out.println(s.reverse());
		
		System.out.println(s);
	}
}
