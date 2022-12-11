public abstract class Product {
	private int id;
	private String manufacturer;
    private String model;
    private int price;
    private static int maxId;

    public Product(String manufacturer, String model, int price) {
    	this.id = this.maxId + 1;
    	this.maxId++;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
    	return "Product{id=" + getId() + ", manufacturer=" + getManufacturer() + ", model=" + getModel() + ", price=" + getPrice() + "}";
    }

}