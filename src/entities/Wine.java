package entities;

/**
 *
 * @author Nemanja Koprivica
 */
//Klasa Wine koja nasledjuje apstraktnu klasu Product
public class Wine extends Product {

    public double bottleVolume;         //Polje klase Wine za zapreminu boce
    public final double ALCOHOLTAX = 1.1;      //Poseban porez za alkoholna pića koji je konstantan

    public Wine(String productName, String barCode, double price, double bottleVolume) {
        super(productName, barCode, price);
        this.bottleVolume = bottleVolume;
    }

    //Redefinisana metoda klase Product u klasi Wine za računanje cene sa PDV-om i dodatnim porezom za alkoholna pića

    @Override
    public double countPrice(double price, double TAX) {
        return super.countPrice(price, TAX) * ALCOHOLTAX; 
    }
   

    //Redefinisana metoda toString za klasu Wine
    @Override
    public String toString() {
        return super.toString() + "\n" + "Bottle volume: " + bottleVolume;
    }
    
    

}
