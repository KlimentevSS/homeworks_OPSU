package N3;

import java.util.ArrayList;
import java.util.Scanner;

import static N3.ObjMass.mas;

public class Shop {

    static void println(String str) {
        System.out.println(str);
    }

    static ArrayList<Product> productList = new ArrayList<Product>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean Active = true;
        boolean Authorized = false;
        int Menu = 0;
        int id = 0;
        int userID = 0;
        int NumOfUsers = -1;
        int busSize = -1;
        String userLogin, userPassword;

        String manufacturer, model;
        int price, maxPrice, minPrice;
        boolean key;
        String login1 = null, password1 = null;

        while (!Authorized) {
            System.out.println("1 - Sign in");
            System.out.println("2 - Sign up");
            System.out.print(">> ");
            Menu = scan.nextInt();
            scan.nextLine();
            if (Menu == 2) {
                println("\nRegistration:");
                System.out.print("Enter new login >> ");
                login1 = scan.nextLine();
                System.out.print("Enter new password >> ");
                password1 = scan.nextLine();
                mas[++NumOfUsers] = new User(login1, password1, new ArrayList<>());
                System.out.println("Successfully registered! \n");
            }
            if (Menu == 1 && NumOfUsers>=0) {
                System.out.print("\nLogin >> ");
                userLogin = scan.nextLine();
                System.out.print("Password >> ");
                userPassword = scan.nextLine();
                for (int i = 0; i < mas.length; i++) {
                    if (userLogin.equals(mas[i].login) && userPassword.equals(mas[i].password)) {
                        Authorized = true;
                        System.out.println("Welcome! \n");
                        userID = i;
                        break;
                    } else {
                        System.out.println("INCORRECT LOGIN OR PASSWORD! \n");
                        break;
                    }
                }
            } else if ((Menu != 1 && Menu != 2) || NumOfUsers<0)
                System.out.println("ERROR! \n");
        }

        while (Active) {
            key = false;
            System.out.println("Menu:");
            System.out.println("1 - add product");
            System.out.println("2 - search product");
            System.out.println("3 - basket");
            System.out.println("4 - exit");
            System.out.print(">> ");
            Menu = scan.nextInt();
            scan.nextLine();
            System.out.println();

            if (Menu == 1) {
                System.out.print("Manufacturer >> ");
                manufacturer = scan.nextLine();
                System.out.print("Model >> ");
                model = scan.nextLine();
                System.out.print("Price >> ");
                price = scan.nextInt();
                Product computer = new Product(manufacturer, model, price);
                productList.add(computer);
                System.out.println("Successfully added! \n");

            } else if (Menu == 2) {
                System.out.println("Search criteria:");
                System.out.println("1- manufacturer");
                System.out.println("2- model");
                System.out.println("3- price");
                System.out.print(">> ");
                int search = scan.nextInt();
                scan.nextLine();

                if (search == 1) {
                    System.out.print("Enter the manufacturer >> ");
                    manufacturer = scan.nextLine();
                    System.out.println("Results:");
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getManufacturer().equals(manufacturer)) {
                            System.out.println(productList.get(i).toString());
                            key = true;
                        }
                    }
                    if (!key) System.out.println("not found 1 \n"); else {
                        System.out.print("Enter the product ID to add it to the basket: >> ");
                        id = scan.nextInt();
                        scan.nextLine();
                        for (int j = 0; j < productList.size(); j++) {
                            if (productList.get(j).getId() == id) {
                                mas[userID].basket.add(++busSize, id);
                                key = true;
                                System.out.println("Successfully added! \n");
                            }
                        }
                        if (!key) System.out.println("not found 2 \n");
                    }
                }
                if (search == 2) {
                    System.out.print("Enter the model >> ");
                    model = scan.nextLine();
                    System.out.println("Results:");
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getModel().equals(model)) {
                            System.out.println(productList.get(i).toString());
                            key = true;
                        }
                    }
                    if (!key) System.out.println("not found 3 \n");
                    else {
                        System.out.print("Enter the product ID to add it to the basket: >> ");
                        id = scan.nextInt();
                        scan.nextLine();
                        for (int j = 0; j < productList.size(); j++) {
                            if (productList.get(j).getId() == id) {
                                mas[userID].basket.add(++busSize, id);
                                key = true;
                                System.out.println("Successfully added! \n");
                            }
                        }
                        if (!key) System.out.println("not found 4 \n");
                    }
                }
                if (search == 3) {
                    System.out.print("Enter maximum price >> ");
                    maxPrice = scan.nextInt();
                    System.out.print("Enter minimum price >> ");
                    minPrice = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Results:");
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getPrice() >= minPrice && productList.get(i).getPrice() <= maxPrice) {
                            System.out.println(productList.get(i).toString());
                            key = true;
                        }}
                    if (!key) System.out.println("not found 5 \n"); else {
                        System.out.print("Enter the product ID to add it to the basket: >> ");
                        id = scan.nextInt();
                        scan.nextLine();
                        for (int j = 0; j < productList.size(); j++) {
                            if (productList.get(j).getId() == id) {
                                mas[userID].basket.add(++busSize, id);
                                key = true;
                                System.out.println("Successfully added! \n");
                            }
                        }
                        if (!key) System.out.println("not found 6 \n");
                    }
                }
            }
            else if (Menu == 3) {
                if(mas[userID].basket.size()!=0){
                    System.out.println("Basket:");
                    for (int j = 0; j <= busSize; j++) {
                        System.out.println(mas[userID].basket.get(j));
                    }
                    System.out.print("Enter the id of product to buy>> ");
                    id = scan.nextInt();
                    scan.nextLine();
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getId() == id) {
                            productList.remove(i);
                            for (int j = 0; j <= busSize; j++) {
                                if (mas[userID].basket.get(j) ==id){
                                    mas[userID].basket.remove(j);
                                }
                            }
                            key = true;
                            System.out.println("Successfully purchased!\n");
                        }
                    }
                    if (!key) System.out.println("not found 7");
                }else
                    System.out.println("BASKET IS EMPTY!");
            }
            else if (Menu == 4) {
                Active = false;
            } else if (Menu!=1 && Menu!=2 &&Menu!=3 && Menu!=4) System.out.println("ERROR! \n");
        }
    }
}