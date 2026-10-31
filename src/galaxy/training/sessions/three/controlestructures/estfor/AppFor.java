package galaxy.training.sessions.three.controlestructures.estfor;

public class AppFor {
    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }
        
        
        System.out.println("-----");
        for (int i = 1; i <= 10 ; i=i+1) {
            System.out.println(i);
        }
        
        System.out.println("-----");
        for (int i = 0; i <= 50 ; i=i+5) {
            System.out.println(i);
        }

        System.out.println("-----");
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
        }
        for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
    }
}
