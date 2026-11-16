package galaxy.training.sessions.session04.jfc.map;


import galaxy.training.sessions.session04.jfc.bean.FrutaClasica;

import java.util.HashMap;
import java.util.Map;

public class AppMapFrutas {


	public static void main(String[] args) {
		
		Map<Long, FrutaClasica> frutas= new HashMap<Long, FrutaClasica>();
		
		/*
		frutas.put(1L, FrutaClasica.builder().codigo(1L).nombre("Pera").cantidad(5).preferencia("P").build());
		frutas.put(2L,FrutaClasica.builder().codigo(2L).nombre("Piña").cantidad(3).preferencia("R").build());
		frutas.put(3L,FrutaClasica.builder().codigo(3L).nombre("Manzana").cantidad(2).preferencia("R").build());
		frutas.put(4L,FrutaClasica.builder().codigo(4L).nombre("Pera").cantidad(5).preferencia("P").build());
		*/

		frutas.put(1L,(new FrutaClasica(1L,"Pera", 5,"P")));
		frutas.put(2L,new FrutaClasica(2L,"Piña", 5,"R"));
		frutas.put(3L,new FrutaClasica(3L,"Manzana", 5,"R"));
		frutas.put(4L,new FrutaClasica(4L,"Pera", 5,"P"));
		
		System.out.println(frutas.get(3L));
		

		Map<String, String> oficinas= new HashMap<>();
		oficinas.put("OTI", "Oficina de Tecnologías de la Información");
		oficinas.put("RRHH", "Oficina de Recursos Humanos");
		oficinas.put("OGA", "Oficina General de Administración");
		oficinas.remove("OTI");
		
		System.out.println(oficinas.get("OGA"));
		oficinas.forEach((k,v)->System.out.println(k+"-"+v));
		System.out.println(oficinas.get("OTI"));

	}

}
