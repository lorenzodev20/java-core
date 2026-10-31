package pe.edu.galaxy.training.java.core.estswitch;

public class AppSwitch {

    public static void main(String[] args) {

        char genero='M';

        switch (genero){
            case 'M':{
                System.out.println("Masculino");
                //break;
            }
            case 'F':{
                System.out.println("Femenino");
                //break;
            }
            case 'P':{
                System.out.println("Prefiero no decirlo");
                break;
            }
            default:{
                System.out.println("No válido");
                break;
            }
        }

    }
}
