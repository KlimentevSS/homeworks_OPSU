package N3;
public class Car implements Nameable {
    private String name;
    Car() {
        this.name = "BMW";
    }
    public String getName() {
        return this.name;
    }
}
