public class Armchair extends Product {
    Armchair(String manufacturer, String model, int price) {
        super(manufacturer, model, price);
    }
    public String getType() {
        return "Armchair";
    }
}