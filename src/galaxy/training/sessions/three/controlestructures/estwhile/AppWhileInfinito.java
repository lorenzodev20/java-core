package pe.edu.galaxy.training.java.core.estwhile;

import java.time.LocalDateTime;

public class AppWhileInfinito {

    public static void main(String[] args) {

        int x=1;
        
        LocalDateTime localDateTimeEnd=LocalDateTime.now().plusSeconds(1);
        
        System.out.println("localDateTimeEnd "+localDateTimeEnd);
        
        while(true){
        	/*
            System.out.println((x++) +" - " + LocalDateTime.now());
            if (LocalDateTime.now().isAfter(localDateTimeEnd)){
                return;
            }*/
        	x++;
        	 System.out.println((x));
            if(x==5)return;
        }

    }
}
