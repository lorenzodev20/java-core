package galaxy.training.sessions.two.controlestructures;

public class AppTernario {
    public static void main(String[] args) {

        int x=0;

        /*
        if (x > 0) {
            System.out.println("X ="+x+" es mayor que cero");
        } else {
            System.out.println("X ="+x+" es menor que cero");
        }*/
        System.out.println((x>=0)?"X ="+x+" es mayor que cero":"X ="+x+" es menor que cero");

        System.out.println( "X ="+x+((x>=0)?" es mayor que cero":" es menor que cero"));

    }
}
