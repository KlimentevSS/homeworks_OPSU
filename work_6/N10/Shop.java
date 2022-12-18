package N10;
import java.util.Scanner;
import java.util.ArrayList;
public class Shop {

    static ArrayList <Computer> productList = new ArrayList<Computer>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean enable = true;
        int menu = 0;
        int id;
        String mark, command;
        int price, maxPrice, minPrice;
        boolean check;

        Computer product;
        product = new Computer("MSI",90000);
        productList.add(product);
        product = new Computer("Asus",40000);
        productList.add(product);
        product = new Computer("Lenovo",30000);
        productList.add(product);
        product = new Computer("Macintosh",100000);
        productList.add(product);
        product = new Computer("Huawei", 50000);
        productList.add(product);

        while (enable) {
            check = false;
            System.out.println("\nMenu:");
            System.out.println("1 - search product");
            System.out.println("2 - buy product");
            System.out.println("3 - work with PC");
            System.out.println("4 - exit");
            System.out.print(">> ");
            menu = scan.nextInt();
            scan.nextLine();
            System.out.println("");


            if (menu == 1) {
                System.out.println("Search criteria:");
                System.out.println("1 - price");
                System.out.println("2 - mark");
                System.out.print(">> ");
                menu = scan.nextInt();
                scan.nextLine();

                if (menu == 1) {
                    System.out.println("\nEnter maximum price>> ");
                    maxPrice = scan.nextInt();
                    System.out.println("\nEnter minimum price>> ");
                    minPrice = scan.nextInt();
                    scan.nextLine();
                    System.out.println("\nResults:");
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getPrice() >= minPrice && productList.get(i).getPrice() <= maxPrice) {
                            System.out.println(productList.get(i).toString());
                            check = true;
                        }
                    }
                    if (!check) System.out.println("\nnot found 1");

                } else if (menu == 2) {
                    System.out.print("\nEnter the mark>> ");
                    mark = scan.nextLine();
                    System.out.println("\nResults:");
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getMark().equals(mark)) {
                            System.out.println(productList.get(i).toString());
                            check = true;
                        }
                    }
                    if (!check) System.out.println("\nnot found 2");
                    menu = 2;
                }
            } else if (menu == 2) {
                System.out.print("\nEnter the id of product>> ");
                id = scan.nextInt();
                scan.nextLine();
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getId() == id) {
                        productList.remove(i);
                        check = true;
                        System.out.println("Successfully purchased!");
                    }
                }
                if (!check) System.out.println("\nnot found 3");

            } else if (menu == 4) {
                enable = false;
            } else if (menu == 3) {
                while (true) {
                    System.out.print("\nEnter the id of PC >> ");
                    id = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter the command:\n"+
                            "run\n"+
                            "shutdown\n"+
                            "exit\n"+">>");
                    command = scan.nextLine();
                    System.out.println();
                    if (command.equals("run")) {
                        productList.get(id).on();
                    } else if (command.equals("monitor.run")) {
                        productList.get(id).monitor.on();
                    } else if (command.equals("shutdown")) {
                        productList.get(id).off();
                    } else if (command.equals("monitor.shutdown")) {
                        productList.get(id).monitor.off();
                    } else break;
                }

            } else System.out.println("\nERROR!");

        }
    }
}
