public class Employee {

    private static int idGenerator = 1;

    private final int id;
    private final String fullName;
    private int depertment;
    private int salary;

    public Employee(String fullName, int depertment, int salary) {
        id = idGenerator++;
        this.fullName = fullName;
        this.depertment = depertment;
        this.salary = salary;
    }

    public void setDepertment(int depertment) {
        this.depertment = depertment;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepertment() {
        return depertment;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", depertment=" + depertment +
                ", salary=" + salary;
    }
}
