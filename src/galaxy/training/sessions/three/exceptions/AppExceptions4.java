package galaxy.training.sessions.three.exceptions;

public class AppExceptions4 {

	public static void main(String[] args) {
		
		if (args.length>0) {

			try {
				System.out.println(args[0]);
				System.out.println(Integer.parseInt(args[0]) * 2);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("No existen elementos en la posición 1");
			} catch (NumberFormatException e) {
				System.err.println("Valor no válido " +args[0]+ ", solo se aceptan números");
			}
			
		}else {
			System.out.println("No existen elementos");
		}
		
	}

}
