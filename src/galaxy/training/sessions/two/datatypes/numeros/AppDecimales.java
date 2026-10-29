package galaxy.training.sessions.two.datatypes.numeros;

import java.lang.Float;
import java.lang.Double;

public class AppDecimales {

	public static void main(String[] args) {
		
		float f= 1274523.75F;
		Float f1= 1274523.75F;


		System.out.println(f);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		String x="523234.50";
		
		System.out.println(Float.valueOf(x)+1);
		System.out.println(Float.parseFloat(x)+1);
		
		
		double d= 1274523323.555d;
		Double d1= 1274523323.555D;
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		 x="523454234.503434";
		
		System.out.println(Double.valueOf(x)+1);
		System.out.println(Double.parseDouble(x)+1);

	}

}
