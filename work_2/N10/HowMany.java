package N10;

//зачтено
import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {
        System.out.println("Enter words: ");
        Scanner scan = new Scanner(System.in);
        String str = " " + scan.nextLine() + " ";
        int k = 0;
        int f = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) ||
                    (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
            } else {
                if (str.charAt(i) != 32)
                    k = 0;
            }
            if (str.charAt(i) == 32) {
                if (k != 0)
                    ++f;
                k = 1;
            }
        }
        System.out.println("Result: " + f + " words");
    }
}
