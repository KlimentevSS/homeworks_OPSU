package N11;
public class Converter implements Convertable {
    public double convertCF(double celsius) {
        return celsius * 1.8 + 32;
    }

    public double convertFC(double fahrenheit) {
        return (fahrenheit - 32) * 0.556;
    }

    public double convertCK(double celsius) {
        return celsius + 273;
    }

    public double convertKC(double kelvin) {
        return kelvin - 273;
    }

    public double convertFK(double fahrenheit) {
        return convertCK(convertFC(fahrenheit));
    }

    public double convertKF(double kelvin) {
        return convertCF(convertKC(kelvin));
    }

    public static void main(String[] args) {
        Converter converter = new Converter();
        System.out.println("30.1 C = " + converter.convertCF(30.1) + " F");
        System.out.println("5 K = " + converter.convertKC(5) + " C");
        System.out.println("0 F = " + converter.convertFK(0) + " K");
    }
}