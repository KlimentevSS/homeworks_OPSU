package N3;
public class Planet implements Nameable {
    private String name;
    Planet() {
        this.name = "Earth";
    }
    public String getName() {
        return this.name;
    }
}