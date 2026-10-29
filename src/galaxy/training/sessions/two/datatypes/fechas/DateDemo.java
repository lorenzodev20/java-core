package galaxy.training.sessions.two.datatypes.fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateDemo {

	public static void main(String[] args) {
		//Given Date in String format
		String oldDate = "2025-04-15";  
		System.out.println("Date before Addition: "+oldDate);
		//Specifying date format that matches the given date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		try{
		   //Setting the date to the given date
		   c.setTime(sdf.parse(oldDate));
		}catch(ParseException e){
			e.printStackTrace();
		 }
		   
		//Number of Days to add
		c.add(Calendar.DAY_OF_MONTH, 2);  
		//Date after adding the days to the given date
		String newDate = sdf.format(c.getTime());  
		//Displaying the new Date after addition of Days
		System.out.println("Date after Addition: "+newDate);

	}

}
