package galaxy.training.sessions.six.exceptions;

public class AppExceptions5 {

	public static void main(String[] args) {
		String n;
		if (args.length>0) {
			n=args[0];
			System.out.println(n);
			try {
				System.out.println(Integer.valueOf(n)*2);
			} catch (NumberFormatException e) {
				System.err.println("Valor no válido " +n+ ", solo se aceptan numeros");
			}
			
		}else {
			System.out.println("No existen elementos");
		}
		
	}

}
