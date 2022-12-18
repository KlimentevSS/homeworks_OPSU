package N5_6;
public class ProcessStrings implements Strings {

    public int countOfSymbols(String str) {
        int counter = 0;

        for(int i = 0; i<str.length(); i++) {
            counter++;
        }
        return counter;
    }

    public String invertString(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }

    public String oddSymbols(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                newStr = newStr + str.charAt(i);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        ProcessStrings a = new ProcessStrings();
        System.out.println(a.countOfSymbols("qwerty"));
        System.out.println(a.invertString("qwerty"));
        System.out.println(a.oddSymbols("1234567"));
    }
}