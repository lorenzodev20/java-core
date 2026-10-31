package galaxy.training.sessions.three.controlestructures.estfor;

import java.util.ArrayList;
import java.util.List;

public class AppForCollection {

	public static void main(String[] args) {

		String frutas[] = { "Piña", "Pera", "Naranja", "Uva" };

		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
		}

		for (String fruta : frutas) {
			System.out.println(fruta);
		}

	}

}
