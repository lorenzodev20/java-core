package galaxy.training.sessions.two.datatypes.fechas;

import java.text.SimpleDateFormat;
import java.time.LocalDate; //Moderna
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date; // Clasica

public class AppFecha {

	public static void main(String[] args) {
	
		Date d= new Date();
		
		System.out.println(d);
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yy");
		System.out.println(sdf.format(d));
		
		sdf= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(d));
		
		sdf= new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf.format(d));
		
		sdf= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		
		java.sql.Date d1= new java.sql.Date(d.getTime());
		
		System.out.println(d.getTime());
		
		System.out.println(d1);
		
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.now().plusDays(2));
		
		java.sql.Date dateSQL= new java.sql.Date(10000L); //DB

		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.now().minusHours(2));
		 DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		 System.out.println(formateador.format(LocalDateTime.now()));
	}

}
