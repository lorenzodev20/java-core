package galaxy.training.sessions.three.controlestructures.estswitch;

public class AppSwitchB {

    public static void main(String[] args) {

        String tipo="Nacional";
        Double precio= 1_500d;

        switch (tipo){
            case "Nacional":{
                if ( precio>100) {
                    precio = 0.9 * precio;
                }
                break;
            }
            case "Importado":{
                if ( precio>1_000) {
                    precio = 0.8 * precio;
                }
                break;
            }
            default:{
                System.out.println("No válido");
                break;
            }
        }

        System.out.println(precio);
    }
}
