package galaxy.training.sessions.three.controlestructures.estswitch;

public class AppSwitchC {

    public static void main(String[] args) {

        TipoEnum tipo=TipoEnum.IMPORTADO;
        Double precio= 500D;
        System.out.println(10.0/100);
        switch (tipo){
            case IMPORTADO:{
                if ( precio>100) {
                    precio = (1-(10/100.0)) * precio;
                }
                break;
            }
            case NACIONAL:{
                if ( precio>1000) {
                    precio = 0.8 * precio;
                }
                break;
            }
            case PROPIO:
                if ( precio>100) {
                    precio = 0.5 * precio;
                }
                break;
            default:{
                System.out.println("No válido");
                break;
            }
        }

        System.out.println(precio);
    }
}
