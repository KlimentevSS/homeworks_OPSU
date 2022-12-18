package N4;
public interface Priceable {
    public int getPrice();

    public static void main(String [] args) {
        Computer сomputer = new Computer();
        System.out.println("Computer: " + сomputer.getPrice() + " ₽");

        Keyboard keyboard = new Keyboard();
        System.out.println("Keyboard: " + keyboard.getPrice() + " ₽");

        Mouse mouse = new Mouse();
        System.out.println("Mouse: " + mouse.getPrice() + " ₽");
    }
}
