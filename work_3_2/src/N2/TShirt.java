package N2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    @Override
    public void dressMan() {
        System.out.println("TShirt is on the man");
    }

    @Override
    public void dressWomen() {
        System.out.println("TShirt is on the woman");
    }
}
