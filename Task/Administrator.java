package Task;

import java.util.ArrayList;

public class Administrator extends Employee {

    public ArrayList<Employee> EmployeeList = new ArrayList<>();


    public Administrator(String name, String surname) {
        super(name, surname);
    }




        public void AddEmployee(Employee e){
            EmployeeList.add(e);
        }

        public void RemoveEmployee(Employee e){
            EmployeeList.remove(e);
        }
}
