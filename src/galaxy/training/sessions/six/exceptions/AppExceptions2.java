package galaxy.training.sessions.six.exceptions;

public class AppExceptions2 {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int d = a / b; //( Error)
            System.out.println(d);
        } catch (Exception e) {
            //e.printStackTrace();
            System.err.println("Error => " + e.getMessage());
        }


    }

}
