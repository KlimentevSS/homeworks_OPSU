package N4;
public class MathFunc implements MathCalculable {
    public double pow(double a, int b) {
        double temp = 1;
        if (b == 0) return 1;
        else if (b > 0) {
            for (int i = 1; i <= b; i++) {
                temp *= a;
            }
            return temp;
        } else {
            for (int i = 1; i <= b * (-1); i++) {
                temp *= a;
            }
            return (double) 1 / temp;
        }
    }

    public double moduleOfComplex(double x, double y) {
        return Math.sqrt((x * x) + (y * y));
    }

    public double moduleOfComplex(String x) {
        String num1, num2;

        x = x.replace(" ", "");
        x = x.replace("+", " ");
        x = x.replace("-", " -");
        x = x.replace(",", ".");
        x = x.replace("j", "i");

        if (x.substring(0, 1).equals(" ")) {
            num1 = x.substring(1, x.lastIndexOf(" "));
        } else {
            num1 = x.substring(0, x.indexOf(" "));
        }

        num2 = x.substring(x.lastIndexOf(" ") + 1, x.indexOf("i"));

        return moduleOfComplex(Double.parseDouble(num1), Double.parseDouble(num2));


    }

    public static void main(String[] args) {
        MathFunc func = new MathFunc();
        System.out.println("5 ^ -4 = " + func.pow(5, -4));
        System.out.println("sqrt(2 ^ 2 + 3 ^ 2) = " + func.moduleOfComplex("2 + 3i"));
    }
}
