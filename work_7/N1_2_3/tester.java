package N1_2_3;
public class tester{
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1, 3, 5, 7);
        System.out.println("\nStart position: " + rectangle.toString());
        System.out.println("Moving: 10");
        rectangle.moveRight(10);
        System.out.println("\nAfter moving position: " + rectangle.toString());
    }
}
