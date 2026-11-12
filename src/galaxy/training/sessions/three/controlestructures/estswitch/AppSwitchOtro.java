package galaxy.training.sessions.three.controlestructures.estswitch;

public class AppSwitchOtro {

    public static void main(String[] args) {

        Mes mes = Mes.ENERO;
        Double precio=10d;
        Double retorno=  switch (mes){
            /*
            case ENERO-> {
                if (precio>50){
                    yield  precio+=precio*0.05;
                }
                yield  precio*0.01;
            }*/
            case ENERO-> {
                //yield (precio>50)?precio*0.05:precio*0.01;
                yield precio*((precio>50)?0.05:0.01); // Operador ternario
            }
            case FEBRERO-> precio;

            case MARZO-> precio;

            default->  throw new IllegalArgumentException("No valido '%s'".formatted(mes));

        };

        System.out.println(retorno);


    }
}
