import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Bookshelf {
    static List <Book> mas1 = new ArrayList<Book>();

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter number of books:");
        int counter = scan.nextInt();
        int count = counter;
        int i = counter;
        while (i != 0) {
            System.out.println("Enter: name, author, year: ");
            mas1.add(new Book(scan.next(), scan.next(), scan.nextInt()));
            --i;
        }

        for(int j = 0; j<counter-1; j++) {
            for (int k = j+1; k< mas1.size(); k++) {
                if(mas1.get(j).getYear() > mas1.get(k).getYear()) {
                    String temp_name = mas1.get(j).getName();
                    String temp_author = mas1.get(j).getAuthor();
                    int temp_year = mas1.get(j).getYear();
                    mas1.get(j).setName(mas1.get(k).getName());
                    mas1.get(k).setName(temp_name);
                    mas1.get(j).setAuthor(mas1.get(k).getAuthor());
                    mas1.get(k).setAuthor(temp_author);
                    mas1.get(j).setYear(mas1.get(k).getYear());
                    mas1.get(k).setYear(temp_year);
                }
            }
        }

        for (int j = 0; j<counter; j++){
            System.out.println(mas1.get(j).toString());
        }
        System.out.println();
        System.out.println("Earliest:");
        System.out.println(mas1.get(0));
        System.out.println("Latest:");
        System.out.println(mas1.get(mas1.size()-1));
    }
}
