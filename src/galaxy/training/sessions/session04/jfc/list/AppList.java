package galaxy.training.sessions.session04.jfc.list;

import java.util.ArrayList;
import java.util.List;

public class AppList {

    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>();

        frutas.add("Pera");
        frutas.add("Piña");
        frutas.add("Manzana");

        System.out.println(frutas.size());

		// For clásico para iterar
		System.out.println("For clásico para iterar");
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }

		System.out.println("For mejorado para iterar");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        frutas.add(1, "Platado"); // Insert

        System.out.println();

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println();
        frutas.set(1, "Papaya"); //Update
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("Delete: ");
        frutas.remove("Papaya"); //Delete
        frutas.remove(0);
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

    }

}
