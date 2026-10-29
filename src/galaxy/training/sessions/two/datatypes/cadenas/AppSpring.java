package galaxy.training.sessions.two.datatypes.cadenas;

public class AppSpring {

	public static void main(String[] args) {
		
		String s="Java "; // clásica
		System.out.println(s);
		
		
		System.out.println("s->" +s);
		
		String s1=new String("java "); //Orientada a Objetos
		
		System.out.println("s1->" +s1);
		
		System.out.println(s.length());
		
		System.out.println(s.trim().length());
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println(s.charAt(0)); //
		
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));//3
		
		System.out.println(s.replace('a', '4'));
		System.out.println(s==s1); // Bad practice
		System.out.println(s.equals(s1));
		
		System.out.println(s.compareTo(s1));
		System.out.println(">>"+ s.compareToIgnoreCase(s1));
		
		System.out.println(s.substring(0, 2));
		
		System.out.println(s); // Inmutable
		
	}

}
