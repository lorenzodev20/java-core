package galaxy.training.sessions.two.operators.matematicos;

public class AppClasicos {

	public static void main(String[] args) {
		// +,-, *, / y %
		//int a=10, b=5;
		int a=10; 
		int b=5;

		System.out.println(a+b);
		
		String curso="Java Core";
		String version="23";
		System.out.println(curso+" "+version);
		System.out.println(curso.concat(" ").concat(version));
		
		//System.out.println(a+1);
		//System.out.println(a+3);
		a=a+1;
		System.out.println(a);
		a=a+3;
		System.out.println(a);
		
		a=10; 
		b=5;
		System.out.println("Resta (-)");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a-b);
		System.out.println(a+"-"+b+"="+(a-b));
		
		a=10; 
		b=5;
		System.out.println("Multiplicación (*)");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a*b);
		System.out.println(a+"*"+b+"="+(a*b));

		a=10; // 10.0
		b=5;
		System.out.println("División (/)");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a/b);
		System.out.println(a+"/"+b+"="+(a/b));
		
		a=9; 
		b=5;
		System.out.println(a+"/"+b+"="+((float)a/b));
		System.out.println(a+"/"+b+"="+(a/(float)b));
		System.out.println(a+"/"+b+"="+((float)a/(float)b));
		System.out.println(a+"/"+b+"="+((double)a/b));
		
		a=9; // 10.0
		b=5;
		System.out.println("Módulo-Residuo (%)"); //mod -
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a/b);
		System.out.println(a+"%"+b+"="+(a%b));
		
		a=120;
		float p=10.0F;
		System.out.println("10% de "+a+"="+((a*10.0)/100)+"%");
		System.out.println(p+"% de "+a+"="+((a*p)/100)+"%");
		
	}

}
