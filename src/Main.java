import jdk.nio.mapmode.ExtendedMapMode;

import java.util.Random;

public class main {
    private final static Random RANDOM = new Random();

    private final static String[] NAMES = {"Андрей","Иван","Михаил","Сергей","Евгений","Александр"};
    private final static String[] SURNAMES = {"Андреев","Иванов","Михаилов","Сергеев","Евгеньев","Александров"};
    private final static String[] PUTRONYMIC_NAMES = {"Андревич","Иванович","Михаилович","Сергевич","Евгеньевич","Александрович"};

    private final static Employee[] EMPLOYEES = new Employee[10];

    private static void initEmployee(){
        for (int i = 0 ; i < EMPLOYEES.length; i++){
            String fullname = SURNAMES[RANDOM.nextInt(0, SURNAMES.length)]+" "+
                    NAMES[RANDOM.nextInt(0, NAMES.length)]+" "+
                    PUTRONYMIC_NAMES[RANDOM.nextInt(0, PUTRONYMIC_NAMES.length)];
            EMPLOYEES[i] = new Employee(fullname, RANDOM.nextInt(1,6), RANDOM.nextInt(50_000,100_000));

        }

    }
    public static void main(String[] args){
        initEmployee();
        print();
        System.out.println("Сумма ЗП сотрудников: " + calculateSumOfSalaries());
        System.out.println("Сотрудника с минимальной ЗП: " + findEmployeeWithMineSalary());
        System.out.println("Сотрудника с максимальной ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("Сотрудника с средней ЗП: " + calculateAvarageOfSalaries());
        printFullNames();
    }

    private static void print(){
        for(Employee employee: EMPLOYEES){
            System.out.println(employee);
        }
    }

    private static int calculateSumOfSalaries(){
        int sum = 0;
        for(Employee employee: EMPLOYEES){
            sum+=employee.getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeWithMineSalary(){
        Employee employeeWithMineSalary = null;
        for(Employee employee: EMPLOYEES){
            if(employeeWithMineSalary == null || employee.getSalary() < employeeWithMineSalary.getSalary()){
                employeeWithMineSalary = employee;
            }
        }
        return employeeWithMineSalary;
    }
    private static Employee findEmployeeWithMaxSalary(){
        Employee employeeWithMaxSalary = null;
        for(Employee employee: EMPLOYEES){
            if(employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()){
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }
    private static double calculateAvarageOfSalaries(){
        return (double) calculateSumOfSalaries() / EMPLOYEES.length;
    }

    private static void printFullNames(){
        for(Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }

}