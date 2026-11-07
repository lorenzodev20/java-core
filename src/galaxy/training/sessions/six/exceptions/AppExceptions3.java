package galaxy.training.sessions.six.exceptions;

public class AppExceptions3 {

	public static void main(String[] args) throws Exception {
		try {
			int a=10;
			int b=0;
			
			int d= a/b; //( Errror)
			
			System.out.println(d);
		} catch (Exception e1) {
			throw e1;
		}
		
	}

}
