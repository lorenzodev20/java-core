package galaxy.training.sessions.three.controlestructures.estswitch;

public class AppSwitchE {

    public static void main(String[] args) {

        char genero='M';

        String msg=  switch (genero){
            case 'M'-> "Masculino";

            case 'F'-> "Femenino";

            default->  throw new IllegalArgumentException("No valido '%s'".formatted(genero));

        };


        int x= 10;
        String msg1=  switch (genero){
            //case 'M'-> { "Masculino"+10};
            case 'M'-> {
                yield "Masculino"+10;
            }
            case 'F'-> "Femenino";

            default->  throw new IllegalArgumentException("No valido '%s'".formatted(genero));

        };

        System.out.println(msg);


    }
}
