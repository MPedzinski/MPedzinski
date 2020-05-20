package T3;

public class Employee extends Person {

    private int hireDate;
    private String companyName;
    public double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    private int getJobSeniority(){
        int yrs;
        yrs = 2020 - hireDate;
        return yrs;
    }

    public double getSalary(){
        return salary;
    }
}
