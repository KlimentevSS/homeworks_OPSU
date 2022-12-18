package N4;
public class Computer implements Priceable {
    private int price;

    Computer() {
        this.price = 50000;
    }

    public int getPrice() {
        return this.price;
    }
}
