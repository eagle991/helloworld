public class Main {
    public static void main(String[] args) {
//Задача №1
        for (int i =1; i <=10; i++) {
            System.out.print(i + " ");
        }

//Задача №2
        for (int i =10; i >=1; i--) {
            System.out.print(i + " ");
        }

//Задача №3
        for (int i =0; i <= 17; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }

//Задача №4
            for (int i =10; i =>-10; i--) {
                System.out.print(i + " ");
            }

//Задача №5
            for (int year =1904; year <=2096; year+=4) {
                System.out.print(year + "год является високосным");
            }

//Задача №6
            for (int i =7; i <=98; i+=7) {
                System.out.print(i + " ");
            }

//Задача №7
            for (int i =1; i <=512; i*=2) {
                System.out.print(i + " ");
            }

//Задача №8
            int amount = 29_000;
            int sum = 0;
            for (int month = 1; month <= 12; month ++) {
                sum += amount;
                System.out.println("Месяц " + month + " сумма накопления ровна " + sum + " руб");
            }

//Задача №9
            int amount = 29_000;
            int sum = 0;
            double percent = 1d/100;
            for (int month = 1; month <= 12; month ++) {
                sum+=amount;
                sum=(int) (sum*(1+percent));
                System.out.println("Месяц"+month + "сумма накопления ровна"+sum+"руб");
            }
//Задача №10
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.printf("%d x %d = %d%n", 2, multiplier, 2 *multiplier );
            }