import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //задача 1
        int[] ints = new int[12];
        System.out.println(Arrays.toString(ints));

        double[] doubles = new double[3];
        doubles[0] = 1.57;
        doubles[1] = 7.654;
        doubles[2] = 9.986;

        boolean[] booleans = new boolean[2];
        booleans[0] = false;
        booleans[1] = false;
        System.out.println(Arrays.toString(booleans));

        String[] strings = {"125", "135", "145"};
        System.out.println(Arrays.toString(strings));
        // задача 2
        int[] ints1 = {1, 3, 4, 56, 7};
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i]);
            if (i < ints1.length - 1) {
                System.out.print(", ");
            }
        }
        //Задача 3
        System.out.println( );
        for(int i = ints1.length-1; i >= 0; i--) {
            System.out.print(ints1[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        //Задача 4
        int[] ints2 = {1, 3, 4, 56,7};
        for(int i = 0; i < ints2.length; i++) {
            if (ints2[i] % 2 !=0) {
                ints2[i]++;
            }
            System.out.println(Arrays.toString(ints2));
        }
    }
}