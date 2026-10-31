package galaxy.training.sessions.four.jfc.list;

import galaxy.training.sessions.four.jfc.bean.FrutaClasica;

import java.util.ArrayList;
import java.util.List;

public class AppListFrutas {

	public static void main(String[] args) {
		
		List<FrutaClasica> frutas= new ArrayList<FrutaClasica>();
		
		/*
		frutas.add(FrutaClasica.builder().codigo(1L).nombre("Pera").cantidad(5).preferencia("P").build());
		frutas.add(FrutaClasica.builder().codigo(2L).nombre("Piña").cantidad(3).preferencia("R").build());
		frutas.add(FrutaClasica.builder().codigo(3L).nombre("Mazana").cantidad(2).preferencia("R").build());
		frutas.add(FrutaClasica.builder().codigo(1L).nombre("Pera").cantidad(5).preferencia("P").build());
		 */
		
		FrutaClasica f1= new FrutaClasica(1L,"Pera", 5,"P");
		frutas.add(f1);
		frutas.add(new FrutaClasica(1L,"Lucma", 5,"P"));
		frutas.add(new FrutaClasica(2L,"Piña", 3,"R"));
		frutas.add(new FrutaClasica(3L,"Mazana", 4,"R"));
		frutas.add(new FrutaClasica(4L,"Platano", 5,"P"));
		frutas.add(f1);
		// v2
		/*
		for (FrutaClasica fruta : frutas) {
			System.out.println(fruta);
		}*/
		
		System.out.println();
		
		// v3
		//frutas.forEach(System.out::println);
		
		System.out.println();
		
		frutas.forEach(f-> System.out.println("Item =>"+f));
		
		System.out.println();

		frutas.forEach(f-> {
			if (f.getCantidad()<4) {
				System.out.println(f);
			}
		});
		frutas.forEach(f-> {;
			if (f.getCantidad()<4) {
				System.out.println(f);
			}
		});
	}
	
}
