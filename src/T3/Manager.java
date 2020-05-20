package T3;

public class Manager extends Employee{

    private double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus= bonus;
        age=2020-birthdayYear;
    }

    @Override
        public double getSalary(){
        salary=salary+bonus;
        return salary;
    }


    @Override
        public String toString(){
        return "Manager with last name "+lastName+" and age "+age+" has salary "+getSalary();

    }


}
