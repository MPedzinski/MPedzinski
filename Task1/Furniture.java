package Task1;

public class Furniture extends Room{

    private final double VAT = 0.23;
    public String name;
    public double price;


    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price ;
    }

    public double getPrice(boolean Vats) {
        if (Vats) {
            return price;
        }
        return price + (price * VAT);
    }


}