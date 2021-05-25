package entities;

/**
 *
 * @author Nemanja Koprivica
 */
public abstract class Product {           //Apstraktna klasa Product

    //Polja apstraktne klase, koja će naslediti klase Wine i Chocolate
    public String productName;
    public String barCode;
    public double price;
    public final double TAX = 1.2;     //PDV porez od 20% koji je final tj. konstantan

    //Metod za izračunavanje PDV-a na osnovnu cenu
    public double countPrice(double price, double TAX) {

        double fullPrice = price * TAX;

        return fullPrice;

    }

    //Konstruktor apstraktne klase koji  će naslediti deca klase 
    //Iako apstraktna klasa sadrži u sebi konstruktor, ona se ne može instancirati
    public Product(String productName, String barCode, double price) {
        this.productName = productName;
        this.barCode = barCode;
        this.price = price;
    }

    //ToString metoda sa osnovnim informacijama i metodom za izracunavanje cene sa porezom
    @Override
    public String toString() {
        return "Product{" + "Product name: " + productName
                + "\n" + "Bar code: " + barCode
                + "\n" + "Price: " + price
                + "\n" + "Tax: " + TAX 
                + "\n" + "Price(PDV): " + countPrice(price, TAX) + '}';
    }

}
