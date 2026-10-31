package pe.edu.galaxy.training.java.core.estswitch;

public class AppSwitchEnum {
    static void main() {
        /*
        String calidad="Otro";
        switch (calidad){
            case "Bueno":{
                System.out.println("Calidad buena");
                break; }
            case "Regular":{
                System.out.println("Calidad regular");
                break;
            }
            default:{
                System.out.println("Calidad no válida");
                break;
            }
        }*/
        Calidad calidad = Calidad.MEDIO;
        switch (calidad) {
            case BUENO: {
                System.out.println("Calidad buena");
                break;
            }
            case REGULAR: {
                System.out.println("Calidad regular");
                break;
            }
            case MALO: {
                System.out.println("Calidad mala");
                break;
            }
            case MEDIO: {
                System.out.println("Calidad media");
                break;
            }
            default: {
                System.out.println("Calidad no válida");
                break;
            }
        }
        }
}
