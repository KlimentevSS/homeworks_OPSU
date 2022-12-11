public class Table extends Product {
    Table(String manufacturer, String model, int price) {
        super(manufacturer, model, price);
    }
    public String getType() {
        return "Table";
    }
}