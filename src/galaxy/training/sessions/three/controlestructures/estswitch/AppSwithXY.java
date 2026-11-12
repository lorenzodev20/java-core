package galaxy.training.sessions.three.controlestructures.estswitch;

public class AppSwithXY {
    static void main() {

        char val = 'x';

        switch (val) {
            case 'x':
                System.out.println("valor x");
                //break;
            case 'y':
                System.out.println("valor y");
                break;
            default:
                System.out.println("valor no es ni x ni y");
        }

        switch (val) {
            case 'x','y':
                System.out.println("valor x de y con switch");
                break;
            /*case 'y':
                System.out.println("valor y");
                break;*/
            default:
                System.out.println("valor no es ni x ni y");
        }

        if (val == 'x' || val == 'y') {
            System.out.println("valor x e y con if");

        } else {
            System.out.println("valor no es ni x ni y");
        }
    }
}
