import java.lang.*;
import java.util.Scanner;
public class TestBall {
    public static void main(String[] args) {
        double x2, y2;
        Ball B1 = new Ball(2.6,3.5);
        Scanner scan = new Scanner(System.in);
        System.out.println("X += ");
        x2 =scan.nextDouble();
        B1.setX2(x2);
        System.out.println("Y += ");
        y2 =scan.nextDouble();
        B1.setY2(y2);
        System.out.println("New X: "+B1.getXnew()+", "+"New Y: "+B1.getYnew());
    }
}
