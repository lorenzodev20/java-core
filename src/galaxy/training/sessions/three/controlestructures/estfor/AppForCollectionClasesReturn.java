package galaxy.training.sessions.three.controlestructures.estfor;

import java.util.ArrayList;
import java.util.List;

public class AppForCollectionClasesReturn {

	static List<Fruta> frutas = new ArrayList<>();

	static {
		frutas.add(new Fruta("Pera", 25.45, 12));
		frutas.add(new Fruta("Uva", 10.00, 5));
		frutas.add(new Fruta("Platano", 15.45, 3));

	}
	public static void main(String[] args) {

		for (Fruta fruta : frutas) {
			System.out.println(fruta);
		}
		System.out.println("----");
		System.out.println(getFruta(" uva"));
		System.out.println(getFrutaBreak(" uva"));

	}

	private static Fruta getFruta(String nombre) {
		for (Fruta fruta : frutas) {
			if (fruta.getNombre().trim().equalsIgnoreCase(nombre.trim())) {
				return fruta;
			}
		}
		return null;
	}

	private static Fruta getFrutaBreak(String nombre) {
		Fruta ret = null;
		for (Fruta fruta : frutas) {
			if (fruta.getNombre().trim().equalsIgnoreCase(nombre.trim())) {
				ret = fruta;
				break;
			}
		}
		return ret;
	}

}
