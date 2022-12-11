package N2;

import java.util.Scanner;
public class Studio {
    public enum Size {
        XXS("children's size", 32),
        XS("adult size", 34),
        S("adult size", 36),
        M("adult size", 38),
        L("adult size", 40);

        private String description;
        private int euroSize;

        private Size(String description, int euroSize) {
            this.description = description;
            this.euroSize = euroSize;
        }

        Scanner scan = new Scanner(System.in);

        public String getDescription() {
            return this.description;
        }

        public double setEuroSize() {
            System.out.println("Enter euroSize:");
            this.euroSize = scan.nextInt();
            return this.euroSize;
        }
    }
}
