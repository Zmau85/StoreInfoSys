package entities;

/**
 *
 * @author Nemanja Koprivica
 */
//Klasa Chocolate koja nasledjuje apstraktnu klasu Product
public class Chocolate extends Product {

    public double weight;       //Polje klase Chocolate za težinu čokolade
 
    //Konstruktor za klasu Chocolate sa nasledjenim poljima iz roditeljske klase i poljem iz klase chocolate
    public Chocolate(String productName, String barCode, double price, double weight) {
        super(productName, barCode, price);
        this.weight = weight;
    }
    
    //Redefinisana metoda toString za klasu Chocolate
     @Override
    public String toString() {
        return super.toString() + "\n" + "Weight: " + weight; 
    }
    
   

}
