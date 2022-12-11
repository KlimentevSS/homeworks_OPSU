public class Sofa extends Product {
    Sofa(String manufacturer, String model, int price) {
        super(manufacturer, model, price);
    }
    public String getType() {
        return "Sofa";
    }
}