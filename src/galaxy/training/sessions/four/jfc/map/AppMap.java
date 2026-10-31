package galaxy.training.sessions.four.jfc.map;

import java.util.HashMap;
import java.util.Map;

public class AppMap {


    public static void main(String[] args) {
		
		/* Incorrecto
		List<String> meses = new ArrayList<>();
		meses.add("Enero");
		meses.add("Febrero");
		meses.add("Marzo");
		*/

        Map<Integer, String> meses = new HashMap<Integer, String>();

        meses.put(1, "Enero"); // Key, Value
        meses.put(2, "Febrero");
        meses.put(3, "Marzo");

        meses.put(10, "Octubre");
        meses.put(11, "Noviembre");
        meses.put(12, "Diciembre");


        System.out.println(meses.get(12));

        Map<String, String> frutas = new HashMap<>();

        frutas.put("1", "Pera"); // Key, Value
        frutas.put("2", "Manzana");
        frutas.put("3", "Piña");
        frutas.put("4", "Mango");

        frutas.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));

        System.out.println(frutas.get("2"));
    }

}
