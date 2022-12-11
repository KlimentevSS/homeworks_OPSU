package N2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    @Override
    public void dressMan() {
        System.out.println("Pants are on the man");
    }

    @Override
    public void dressWomen() {
        System.out.println("Pants are on the woman");
    }
}
