import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Shop {
    static List <Comp> mas = new ArrayList<Comp>();

    public static void main(String[] args) {
        int menu = 0;
        int counter = -1;

        while (menu != 3) {
            Scanner scan = new Scanner(System.in);
            if (menu == 0) {
                System.out.println("\nMenu:");
                System.out.println("1 - add comp");
                System.out.println("2 - search");
                System.out.println("3 - exit");
                System.out.println("4 - delete comp");
                menu = scan.nextInt();
                System.out.println("-----------------");

                if (menu == 1) {
                    ++counter;
                    System.out.println("Enter name, prise, year");
                    Scanner scan1 = new Scanner(System.in);
                    mas.add (new Comp(scan1.next(), scan1.nextDouble(), scan1.nextInt()));
                    menu =0;
                }

                if (menu == 2) {
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Enter comp name: ");
                    String cn = scan2.nextLine();
                    int en=0;
                    for (int i = 0; i < mas.size(); i++) {
                        if (mas.get(i).getName().equals(cn)) {
                            System.out.println("Year: " + mas.get(i).getYear());
                            System.out.println("Price: " + mas.get(i).getPrice());
                            en = 1;
                            break;
                        }
                    }
                    if (en == 0) {
                        System.out.println("Not found!");
                    }
                    menu=0;
                }

                if (menu == 3) {
                    break;
                }

                if (menu == 4) {
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Enter comp name: ");
                    String cn = scan2.nextLine();
                    for (int i = 0; i < mas.size(); i++) {
                        if (mas.get(i).getName().equals(cn)) {
                            mas.remove(i);
                            break;
                        }
                    }
                    menu=0;
                }
            }
        }
    }

    public static class Comp {
        private String name;
        private double price;
        private int year;

        public Comp(String name, double price, int year) {
            this.name = name;
            this.price = price;
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }
}