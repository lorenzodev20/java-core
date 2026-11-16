package galaxy.training.sessions.session04.jfc.poo;

import galaxy.training.sessions.session04.jfc.bean.Fruta;
import galaxy.training.sessions.session04.jfc.bean.FrutaClasica;
import galaxy.training.sessions.session04.jfc.bean.FrutaInternacional;

public class AppFruta {
    static void main() {

        FrutaClasica fruta = new FrutaClasica();

        fruta.setNombre("Manzana");
        fruta.setCantidad(5);
        fruta.setPreferencia("Si");
        System.out.println("Fruta Clásica: " + fruta.getNombre()
                + ", Cantidad: " + fruta.getCantidad()
                + ", Preferencia: " + fruta.getPreferencia());

        FrutaClasica fruta1 = new FrutaClasica(2L, "Pera", 10, "No");
        System.out.println("Fruta Clásica: " + fruta1.getNombre()
                + ", Cantidad: " + fruta1.getCantidad()
                + ", Preferencia: " + fruta1.getPreferencia());


        //Fruta fruta=new Fruta(); // NO es fácil instance una clase abstracta
        Fruta fruta2 = new FrutaInternacional();
        fruta2.setNombre("Fresa");
        fruta2.setCantidad(15);
        fruta2.setPreferencia("Si");
        System.out.println("FrutaNacional: " + fruta2.getNombre()
                + ", Cantidad: " + fruta2.getCantidad()
                + ", Preferencia: " + fruta2.getPreferencia());
    }
}