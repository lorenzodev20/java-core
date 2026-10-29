package galaxy.training.sessions.two.datatypes.cadenas;

public class AppRendimiento {

	public static void main(String[] args) {

		long inicio;
		long fin;
		
		final long CAN = 100_000; // Constante;
		
		//CAN = 6_000_000;
		//CAN=1000;
		
		String s = new String("");
		
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < CAN; i++) {
			s.concat("x");
		}
		fin = System.currentTimeMillis();
		
		System.out.println("String :"+(fin - inicio));
		
		
		StringBuffer sb = new StringBuffer("");
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < CAN; i++) {
			sb.append("x");
		}
		fin = System.currentTimeMillis();
		System.out.println("StringBuffer :"+(fin - inicio));
		
		
		StringBuilder sbi = new StringBuilder("");
		inicio = System.currentTimeMillis();
		for (int i = 0; i < CAN; i++) {
			sbi.append("x");
		}
		fin = System.currentTimeMillis();
		System.out.println("StringBuilder :"+(fin - inicio));

	
	}

}
