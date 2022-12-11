package N1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter the season:");
        Scanner scan = new Scanner(System.in);

        Season season1=Season.valueOf(scan.next());

        String a="I love ";
        switch (season1){
            case fall:
                System.out.println(a+"fall");
            case spring:
                System.out.println(a+"spring");
            case summer:
                System.out.println(a+"summer");
            case winter:
                System.out.println(a+"winter");
        }

        System.out.println("Enter average temperature:");
        season1.getAvtemp();
        Season[] allSeasons = Season.values();
        for(Season season : allSeasons) {
            System.out.println("Season: "+season);
            System.out.println("Average temperature: "+season.avtemp);
            System.out.println("Description: "+season+season.descript+"\n");
        }
    }

    public enum Season {
        fall(7.2, " is a acceptable season."),
        spring(14.9, " is an acceptable season."),
        summer(20.3, " is a warm season."),
        winter(-20.1, " is an cold season.");

        private double avtemp;
        private String descript;

        private Season(double avtemp, String descript) {
            this.avtemp = avtemp;
            this.descript = descript;
        }

        Scanner scan1 = new Scanner(System.in);

        public double getAvtemp() {
            this.avtemp = scan1.nextDouble();
            return this.avtemp;
        }

        public String getDescription() {
            return this.descript;
        }
    }

}