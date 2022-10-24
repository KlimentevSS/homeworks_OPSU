//1_2
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        int max = - 2147483647;

        int min = 2147483647;

        System.out.println("Number of elements: ");

        int num = scan.nextInt();

        int[] mas = new int[num];

        System.out.println("Enter the numbers: ");

        while (num>0){

            --num;

            mas[num] = scan.nextInt();

            if (mas[num]>max)

                max=mas[num];

            if (mas[num]<min)

                min=mas[num];

            sum +=mas[num];

        }

        System.out.println("SUM: "+ sum);

        System.out.println("MIN: "+ min);

        System.out.println("MAX: "+ max);

    }

}