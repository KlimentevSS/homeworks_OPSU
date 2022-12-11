public class Carpet extends Product {
    Carpet(String manufacturer, String model, int price) {
        super(manufacturer, model, price);
    }
    public String getType() {
        return "Carpet";
    }
}