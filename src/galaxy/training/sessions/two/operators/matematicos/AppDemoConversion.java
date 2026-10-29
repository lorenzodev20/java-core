package galaxy.training.sessions.two.operators.matematicos;

public class AppDemoConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b=3;
		//float a=5, b=3;
		System.out.println(a/b);
		System.out.println( Float.valueOf(a)/b);
		System.out.println( a/(float)b);
		
	}

}
