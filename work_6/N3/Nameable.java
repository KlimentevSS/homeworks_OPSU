package N3;
public interface  Nameable {
    public abstract String getName();

    public static void main(String [] args) {
        Planet planet1 = new Planet();
        System.out.println(planet1.getName());

        Man man1 = new Man();
        System.out.println(man1.getName());

        Car car1 = new Car();
        System.out.println(car1.getName());
    }
}
