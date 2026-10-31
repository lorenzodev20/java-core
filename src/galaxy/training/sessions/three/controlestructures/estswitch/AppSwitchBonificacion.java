package pe.edu.galaxy.training.java.core.estswitch;

public class AppSwitchBonificacion {

    public static void main(String[] args) {

        int mes=6;
        /*
        switch (mes){
            case 7:
            case 12:{
                System.out.println("Sueldo + Bonificación");
                break;
            }
            case 1,2,3,4,5,6:{
                System.out.println("Sueldo");
                break;
            }
            default:{
                System.out.println("No válido");
                break;
            }
        }*/
        if (mes==7 || mes==12){
            System.out.println("Sueldo + Bonificación");
        }else {
            System.out.println("Sueldo");
        }


    }


}
