public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] ints3 = {1, 3, 4, 56, 7};
        int result = 0;
        for (int i = 0; i < ints3.length; i++) {
            result += ints3[i];
        }
        System.out.println("Сумма трат за месяц составила " + result + " рублей");

        //Задача 2
        System.out.println();
        int max = ints3[0];
        int min = ints3[0];
        for (int i = 0; i < ints3.length; i++) {
            if (max < ints3[i]) {
                max = ints3[i];
            }
            if (min > ints3[i]) {
                min = ints3[i];
            }
            System.out.println("Максимальное " + max);
            System.out.println("Минимальное " + min);
        }
        //Задача 3
        int[] ints5 = {1, 3, 4, 56, 7};
        int result1 = 0;
        for (int i = 0; i < ints5.length; i++) {
            result1 += ints5[i];
        }
        System.out.println("Сумма трат за месяц составила " + result1 + " рублей");
        double avarage = (double) result1 / ints5.length;
        System.out.printf("Сумма трат за месяц составила %.2f рублей %n ", +avarage);
        //Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}