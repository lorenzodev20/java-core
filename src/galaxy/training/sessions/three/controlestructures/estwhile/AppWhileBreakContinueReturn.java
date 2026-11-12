package galaxy.training.sessions.three.controlestructures.estwhile;

public class AppWhileBreakContinueReturn {

    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }*/

        System.out.println();
        int i = 1;
        while (i <= 10) {
            //i++;
            if(i==5) break;
            System.out.println(i++);
        }

        System.out.println();
        i=0;
        while (i <= 10) {
            i++;
            if(i==5) continue;
            System.out.println(i);
        }
        System.out.println();
        i=0;
        while (i <= 10) {
            i++;
            if(i==5) return;
            System.out.println(i);
        }
        System.out.println("Fin");
    }
}
