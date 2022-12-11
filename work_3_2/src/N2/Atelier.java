package N2;

import java.util.ArrayList;
import static java.lang.reflect.Array.get;
public interface Atelier extends MenClothing, WomenClothing {

    static ArrayList<Clothes> listOfClothes = new ArrayList<Clothes>();


    public static void dressMan(ArrayList<Clothes> list) {
        for (int i = 0; i < list.size(); i++) {
                if (list.get(i) instanceof MenClothing)
            ((MenClothing) list.get(i)).dressMan();
        }
    }

    public static void dressWoman(ArrayList<Clothes> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof WomenClothing)
            ((WomenClothing) list.get(i)).dressWomen();
        }
    }

    public static void main(String[] args) {
        listOfClothes.add(new Pants());
        listOfClothes.add(new TShirt());
        listOfClothes.add(new Skirt());
        listOfClothes.add(new Tie());
        dressMan(listOfClothes);
        dressWoman(listOfClothes);
    }
}