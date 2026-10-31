package galaxy.training.sessions.four.jfc.set;

import galaxy.training.sessions.four.jfc.bean.FrutaClasica;

import java.util.HashSet;
import java.util.Set;

public class AppSetFrutas {

    public static void main(String[] args) {

        Set<FrutaClasica> frutas = new HashSet<FrutaClasica>();
		
		/*
		frutas.add(FrutaClasica.builder().codigo(1L).nombre("Pera").cantidad(5).preferencia("P").build());
		frutas.add(FrutaClasica.builder().codigo(2L).nombre("Pi�a").cantidad(3).preferencia("R").build());
		frutas.add(FrutaClasica.builder().codigo(3L).nombre("Mazana").cantidad(2).preferencia("R").build());
		frutas.add(FrutaClasica.builder().codigo(1L).nombre("Pera").cantidad(5).preferencia("P").build());
	*/

        FrutaClasica frutaD = new FrutaClasica(1L, "Pera", 5, "P");

        //frutas.add(new FrutaClasica(1L,"Pera", 5,"P"));
        frutas.add(frutaD);
        frutas.add(new FrutaClasica(2L, "Piña", 5, "R"));
        frutas.add(new FrutaClasica(3L, "Mazana", 5, "R"));
        frutas.add(frutaD);


        for (FrutaClasica fruta : frutas) {
            System.out.println(fruta);
        }
        FrutaClasica f4 = new FrutaClasica(4L, "Uva", 5, "R");
        frutas.add(f4);
        System.out.println();

        frutas.forEach(System.out::println);
        System.out.println();
        frutas.remove(f4);
        frutas.forEach(System.out::println);

    }

}
