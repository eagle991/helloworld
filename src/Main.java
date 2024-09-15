public class Main {
    public static void main(String[] args) {
//Задача 1
        int[] ints3 = {1, 3, 4, 56,7};
        int result = 0;
        for(int i = 0; i < ints3.length; i++) {
            result += ints3[i];
        }
        System.out.println("Сумма трат за месяц составила "+result+" рублей");
    }

    //Задача 2
    int[] ints4 = {1, 3, 4, 56,7};
Arrays.sort(ints4);
System.out.println(Arrays.toString(ints4));
System.out.println("Максимальное "+ints4[ints4.length-1]);
System.out.println("Минимальное "+ints4[0]);
}else{
        System.out.println("Максимальное и Минимальное не существует");
}
int max = ints4[0];
int min = ints4[0];
for(int i = 0; i < ints4.length; i++) {
        if(max < ints4[i]) {
max = ints4[i];
        }
        if(min > ints4[i]) {
min = ints4[i];
        }
        System.out.println("Максимальное "+max);
System.out.println("Минимальное "+min);
}else{
        System.out.println("Максимальное и Минимальное не существует");
}

//Задача 3
int[] ints5 = {1, 3, 4, 56,7};
int result = 0;
for(int i = 0; i < ints5.length; i++) {
result += ints5[i];
        }
        System.out.println("Сумма трат за месяц составила "+result+" рублей");
double avarage = (double) result / inst5.legth;
System.out.printf("Сумма трат за месяц составила %.2f рублей %n ",+avarage);
}
//Задача 4
char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
for(int i = reverseFullName.length -1; i >= 0; i--) {
        System.out.print("reverseFullName[i]");
}
        for(int i = 0; i < reverseFullName.length /2; i >= 0; i++) {
char temp = reverseFullName[i];
reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
reverseFullName[reverseFullName.length - i - 1] = temp;
}
        System.out.print(Arrays.toString(reverseFullName));