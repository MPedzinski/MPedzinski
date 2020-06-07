package Task;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Employee extends User{


    static int EmployeeID = 0;
    public String ID2;
    public ArrayList<Client> ClientList = new ArrayList<>();

    public Employee(String name, String surname) {
        super(name, surname);
        EmployeeID++;
        ID2=" Emp."+  EmployeeID;

    }


    public void AddCustomer(Client c){
        ClientList.add(c);
    }

    public void OpenAccount(Client c){
        c.HasAccount=true;
    }





}
