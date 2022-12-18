package N7_8_9;
import java.util.ArrayList;
public interface Printable {
    public String getTitle();
    public void print();
    ArrayList <Printable> list = new ArrayList<Printable>();


    public static void printMagazine(ArrayList <Printable> printable) {
        System.out.println("\nMagazines:");
        for (int i = 0; i < printable.size(); i++) {
            if (printable.get(i) instanceof Magazine) {
                System.out.println(printable.get(i).getTitle());
            }
        }
        System.out.println();
    }

    public static void printBooks(ArrayList <Printable> printable) {
        System.out.println("Books:");
        for (int i = 0; i < printable.size(); i++) {
            if (printable.get(i) instanceof Book) {
                System.out.println(printable.get(i).getTitle());
            }
        }
        System.out.println();
    }

    public static void main(String [] args) {
        list.add(new Book("Book1"));
        list.add(new Book("Book2"));
        list.add(new Magazine("Murzilka"));

        printMagazine(list);
        printBooks(list);
    }
}
