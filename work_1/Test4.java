//1_4
import java.text.DecimalFormat;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {

            System.out.println(new DecimalFormat( "00.###" ).format(1. / i));

        }

    }

}
