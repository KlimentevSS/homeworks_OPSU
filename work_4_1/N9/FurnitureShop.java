import java.util.Scanner;
import java.util.ArrayList;
public class FurnitureShop {

    static ArrayList<Product> productList = new ArrayList<Product>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean enable = true;
        boolean check = false;
        int menu = 0;
        int id;
        String manufacturer, model;
        int price, maxPrice, minPrice;

        Product product;
        product = new Sofa("Company1", "raskladushka", 11999);
        productList.add(product);
        product = new Sofa("Company7", "divan", 12000);
        productList.add(product);
        product = new Table("Company2", "buratino", 9999);
        productList.add(product);
        product = new Table("Company4", "stol", 10000);
        productList.add(product);
        product = new Armchair("Company3", "taburet", 5999);
        productList.add(product);
        product = new Carpet("Company1", "blinchik", 999);
        productList.add(product);

        while (enable) {
            System.out.println("Menu:");
            System.out.println("1 - search product");
            System.out.println("2 - buy product");
            System.out.println("3 - exit");
            System.out.print(">> ");
            menu = scan.nextInt();
            scan.nextLine();
            System.out.println();

            if (menu == 1) {
                System.out.println("Search criteria:");
                System.out.println("1 - price");
                System.out.println("2 - manufacturer");
                System.out.println("3 - model");
                System.out.print(">> ");
                menu = scan.nextInt();
                System.out.println();
                scan.nextLine();

                if (menu == 1) {
                    System.out.print("Enter maximum price >> ");
                    maxPrice = scan.nextInt();
                    System.out.print("Enter minimum price >> ");
                    minPrice = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Results:");
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getPrice() >= minPrice && productList.get(i).getPrice() <= maxPrice) {
                            System.out.println(productList.get(i).toString());
                            check = true;
                        }
                    }
                    if (!check) System.out.println("not found\n");

                } else if (menu == 2) {
                    System.out.print("Enter the company >> ");
                    manufacturer = scan.nextLine();
                    System.out.println("Results:");
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getManufacturer() == manufacturer) {
                            System.out.println(productList.get(i).toString());
                            check = true;
                        }
                    }
                    if (!check) System.out.println("not found\n");

                } else if (menu == 3) {
                    System.out.print("Enter the company >> ");
                    manufacturer = scan.nextLine();
                    System.out.print("Enter the model >> ");
                    model = scan.nextLine();
                    System.out.println("Results:");
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getManufacturer() == manufacturer && productList.get(i).getModel() == model) {
                            System.out.println(productList.get(i).toString());
                            check = true;
                        }
                    }
                    if (!check) System.out.println("not found\n");
                }
            }
            if (menu == 2) {
                System.out.print("Enter id >> ");
                id = scan.nextInt();
                scan.nextLine();
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getId() == id) {
                        productList.remove(i);
                        check = true;
                        System.out.println("Successfully purchased!\n");
                    }
                }
                if (!check) System.out.println("not found\n");
            }
            if (menu == 3) {
                enable = false;
            }
            else if (menu !=1 && menu !=2 && menu !=3)
                System.out.println("ERROR!\n");
        }
    }
}