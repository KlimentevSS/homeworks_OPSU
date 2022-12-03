package N8;

public class Reverse {
    public static void main(String[] args) {
        String [] array = {"y", "t", "r", "e", "w", "q"};

        for (int i = 0; i < array.length / 2; i++) {
            String tempString = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i - 1] = tempString;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
