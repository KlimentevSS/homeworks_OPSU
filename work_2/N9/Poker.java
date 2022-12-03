package N9;

//зачтено
import java.util.Scanner;
public class Poker {
    public static void main(String[] args) {
        int n = 52;
        String[] suits = {"S", "C", "D", "H"};
        String[] rank = {"2", "3", "4", "5", "6", "7",
                "8", "9", "10","V", "Q", "K", "A"};
        String[] deck = new String[n];

        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length*i + j] = rank[i] + " " + suits[j];
            }
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int players = scan.nextInt();
        double ch=players*5;

        for (int i = 0; i < n; i++) {
            int rand = i + (int) (Math.random() * (n-i));
            String d1 = deck[rand];
            deck[rand] = deck[i];
            deck[i] = d1;
        }

        System.out.println("\nPlayer 1: ");
        for (int i = 0; i < players * 5; i++) {
            int ch1=(i+1)/5;
            double ch2=(double) (i+1)/5;
            System.out.println(deck[i]);
            if (ch1==ch2&&ch1!=players)
                System.out.println("\nPlayer "+(ch1+1)+": ");
        }
    }
}