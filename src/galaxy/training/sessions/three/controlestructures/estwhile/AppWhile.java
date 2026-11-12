package galaxy.training.sessions.three.controlestructures.estwhile;

public class AppWhile {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        int i = 1;
        while (i <= 10) {
            //i++;
            System.out.println(i++);
        }

        System.out.println();

        i = 1;
        do {
            //i++;
            System.out.println(i++);

        } while (i <= 10);


    }
}
