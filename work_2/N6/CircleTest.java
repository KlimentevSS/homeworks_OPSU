package N6;

import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args) {
        double r;
        Circle1 a = new Circle1(3, 5, 7);
        Circle1 b = new Circle1(3, 8, 1);
        System.out.println("Length of circle = " + a.getPerimetr() + "sm");
        Scanner source = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        r = source.nextDouble();
        b.setR(r);
        System.out.println("a equals b " + a.equals(b));
        b.toString();

    }
}
