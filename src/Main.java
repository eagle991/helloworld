import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        //5 Задача
        int value = 33;
        System.out.println(value);
        changeValue(value);
        System.out.println(value);
    }
    private static void changeValue(int temp) {
        temp = 22;
        System.out.println("changeValue " + temp);
    }
    //------------------------------------------------------------
    //6 Задача
    public static void main(String[] args) {
        Integer value = 44;
        System.out.println(value);
        changeValue(value);
        System.out.println(value);
    }
    private static void changeValue(Integer temp) {
        temp = 22;
        System.out.println("changeValue " + temp);
    }
    //------------------------------------------------------------
    //7 Задача
    public static void main(String[] args) {
        Integer[] value = {1,2};
        System.out.println(Arrays.toString(value));
        changeValue(value);
        System.out.println(Arrays.toString(value));
    }
    private static void changeValue(Integer[] temp) {
        temp = new Integer[]{5,5,6};
        System.out.println("changeValue " +Arrays.toString(temp));
    }
    //------------------------------------------------------------
    //8 Задача
    public static void main(String[] args) {
        Integer[] value = {1,2};
        System.out.println(Arrays.toString(value));
        changeValue(value);
        System.out.println(Arrays.toString(value));
    }
    private static void changeValue(Integer[] temp) {
        temp[0] = 99;
        System.out.println("changeValue " +Arrays.toString(temp));
    }
    //------------------------------------------------------------
    //9 Задача
    public static void main(String[] args) {
        Person person = new Person("Trubetskoy", "Lyapis");
        System.out.println(person);
        changeValue(person);
        System.out.println(person);
    }
    private static void changeValue(Person temp) {
        temp = new Person("Lagutenko", "Ilya");
        System.out.println("changeValue " + temp);
    }
    //------------------------------------------------------------
    //10 Задача
    public static void main(String[] args) {
        Person person = new Person("Trubetskoy", "Lyapis");
        System.out.println(person);
        changeValue(person);
        System.out.println(person);
    }
    private static void changeValue(Person person) {
        person = new Person("Lagutenko", "Ilya");
        System.out.println("changeValue " + person);
    }
}