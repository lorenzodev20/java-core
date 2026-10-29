package pe.edu.galaxy.training.java.jd0.app;

import java.util.Vector;

public class AppVector {
    static void main() {
        /*
        Object frutas[][]= {
                {"Piña",2,"F"},
                {"Naranja",5,"R"},
                {"Uva",5,"F"},
        };
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                if (j==1 || j==2) {
                    System.out.print("\t"+frutas[i][j]);

                }else {
                    System.out.print(frutas[i][j]);
                }

            }
            System.out.println();
        }*/

    /*
    Vector frutas = new Vector();
    frutas.add("Piña");
    frutas.add(2);
    frutas.add("F");
    frutas.add("Naranja");
    frutas.add(5);
    frutas.add("R");
    frutas.add("Uva");
    frutas.add(5);
    frutas.add("F");
    System.out.println(frutas);
    */
        /*
        Vector<Object> frutas = new Vector<Object>();
        frutas.add("Piña");
        frutas.add(2);
        frutas.add("F");
        frutas.add("Naranja");
        frutas.add(5);
        frutas.add("R");
        frutas.add("Uva");
        frutas.add(5);
        frutas.add("F");
        System.out.println(frutas);
*/
        /*
        Vector<String> frutas = new Vector<String>();
        frutas.add("Piña");
        frutas.add("2");
        frutas.add("F");
        frutas.add("Naranja");
        frutas.add("5");
        frutas.add("R");
        frutas.add("Uva");
        frutas.add("5");
        frutas.add("F");
        System.out.println(frutas);

        */
        Vector<Fruta> frutas = new Vector<Fruta>();
        frutas.add(new Fruta("Piña", 2, "F"));
        frutas.add(new Fruta("Naranja", 5, "R"));
        frutas.add(new Fruta("Uva", 5, "F"));
        frutas.add(new Fruta("Fresa", 3, "F"));
        System.out.println(frutas);

}
}
