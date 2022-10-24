import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter NUM:");

        int num= scan.nextInt();

        fctr(num);

    }

    public static void fctr(int num) {

        int res = num;

        for (int i = 1; i < num; i++) {

            res = res * i;

        }

        System.out.println(num+"!"+" = "+res);

    }

}