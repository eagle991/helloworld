public class Main {
    public static void main(String[] args) {
        //задача 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.printf("Ф. И. О. сотрудника —%s", fullName);
        //Задача 2
        String fullNametoUpperCase = fullName.toUpperCase();
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета —%s\n",fullNametoUpperCase);
        //задача 3
        fullName = "Иванов Семён Семёнович";
        String result = fullName.replace("ё", "е");
        System.out.printf("Данные Ф. И. О. сотрудника  —%s\n", result);
    }
}