package galaxy.training.sessions.six.exceptions;

public class PrimaryException {
    public static void main(String[] args) {
        try {
            int n1 = 2;
            int n2 = 1;
            int n3 = n1 / n2;

            System.out.println("Resultado: " + n3);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }
}
