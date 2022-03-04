package ClassEx15_50;

public class Imsi {
    public static void main(String[] args) {
        Employer employer = new Employer(3000);
        Employee employee = new Employee(0);

        employer.payForWork(employee, 1000);

        employer.showMyMoney();
        employee.showMyMoney();
    }
}
