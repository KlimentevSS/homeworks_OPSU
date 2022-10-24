//1_1

public class Test1 {

    public static void main(String[] args) {

        int sum = 0;

        int[] a = {1, 2, 5, 6, 9, 55};

        for(int i=0;i<a.length;i++) {

            sum += a[i];

        }

        System.out.println("SUM: "+ sum);

        System.out.println("AVERAGE: "+sum/a.length);

    }

}