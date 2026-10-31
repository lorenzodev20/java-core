package pe.edu.galaxy.training.java.core.estswitch;

public class AppSwitchDYield {

    public static void main(String[] args) {

        char genero='M';
        /*
        String msg="";
        switch (genero){
            case 'M':{
                msg=  "Masculino";
                break;
            }
            case 'F':{
                msg= "Femenino";
                break;
            }
            default:{
                msg= "No vál   ido";
            }
            System.out.println(msg);
        }*/
    int val=0;
     String msg=  switch (genero){
            case 'M':{
               yield  "Masculino";
            }
            case 'F':{
                if (val>5) {
                    yield "Femenino con valor mayor a 5";
                }
                yield "Femenino";
            }
            default:{
                yield "No válido";
            }
        };

        System.out.println(msg);


    }
}
