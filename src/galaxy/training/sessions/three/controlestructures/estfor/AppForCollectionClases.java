package galaxy.training.sessions.three.controlestructures.estfor;

import java.util.ArrayList;
import java.util.List;

public class AppForCollectionClases {

    public static void main(String[] args) {

        List<Fruta> frutas= new ArrayList<>();
        
        frutas.add(new Fruta("Pera",25.45,12));
        frutas.add(new Fruta("Uva",10.00, 5));
        
        for (Fruta fruta:frutas){
            System.out.println(fruta);
        }
    }



}
