package storeinfosys;

import entities.Chocolate;
import entities.Wine;

/**
 *
 * @author Nemanja Koprivica
 */
//Test klasa
public class StoreInfoSys {

    public static void main(String[] args) {

        //Instanciranje klase Wine tj. kreiranje objekta wine
        Wine wine = new Wine("Chardonnay", "555-03-985", 120, 1.5);

        //Štampanje informacija o objektu klase wine
        System.out.println(wine);

        System.out.println("------------------------------------------------------");

        //Instanciranje klase Chocolate tj. kreiranje objekta chocolate
        Chocolate chocolate = new Chocolate("Milka", "555-06-067", 80, 100);

        //Štampanje informacija o objektu klase chocolate
        System.out.println(chocolate);

    }

}
