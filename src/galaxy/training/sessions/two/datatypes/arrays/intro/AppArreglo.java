package pe.edu.galaxy.training.java.jd0.app.intro;

public class AppArreglo {

    static void main() {
        int a1=10;
        int a2=20;
        int a3=30;
        int a4=40;
        int a5=50;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

        System.out.println("-------------------");

        int[] arreglo = new int[5];
        arreglo[0] = 10;
        arreglo[1] = 20;
        arreglo[2] = 30;
        //arreglo[3] = 40;
        //arreglo[4] = 50;

       for(int i=0; i<arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
        System.out.println("-------------------");
        for (int valor : arreglo) {
            System.out.println(valor);
        }
    }
}
