package galaxy.training.sessions.two.controlestructures;

public class AppIfElseIf {
    public static void main(String[] args) {

        int x=10;

        if (x > 0) {
            System.out.println("X ="+x+" es mayor que cero");
        } else if (x==0) {
            System.out.println("X ="+x+" es neutro");
        }else{
            System.out.println("X ="+x+" es menor que cero");
        }
    }
}
