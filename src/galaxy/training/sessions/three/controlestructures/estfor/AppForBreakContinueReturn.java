package galaxy.training.sessions.three.controlestructures.estfor;

public class AppForBreakContinueReturn {
    public static void main(String[] args) {

        final int MAX=20;
		/*
		 * for (int i = 1; i <= MAX ; i++) { System.out.println(i);
		 * 
		 * }
		 */
        System.out.println("----");

        for (int i = 1; i <= MAX ; i++) {
            System.out.println(i);
            if(i==10){
            	break;
            }
        }
       
        
        System.out.println("----");
        for (int i = 1; i <= MAX ; i++) {
            if(i==10){
                continue;
            }
            System.out.println(i);
            // n LC
        }
        /*
        System.out.println("----");
        for (int i = 1; i <= MAX ; i++) {
            System.out.println(i);
            if(i==10){
                return;
            }
        }*/

        System.out.println("----");
        System.out.println("Fin");
    }

}
