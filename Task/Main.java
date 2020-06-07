package Task;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);

        Administrator a1= new Administrator("John", "Godson");
        Employee e1= new Employee("Mike", "Wazowski");
        Employee e2= new Employee("Steve", "Baller");
        Client c1= new Client("Cary-Hiroyuki", "Tagawa");
        Client c2= new Client("LeBron", "James");
        Client c3= new Client("Marneus", "Calgar");
        Client c4= new Client("Anakin", "Skywalker");



        e1.AddCustomer(c1);
        e1.AddCustomer(c2);
        e1.AddCustomer(c3);
        e2.AddCustomer(c4);

        c1.ClientsAccount().MakeDeposit();
        c2.ClientsAccount().MakeDeposit();
        c3.ClientsAccount().MakeDeposit();
        c4.ClientsAccount().MakeDeposit();

        try {
            c1.ClientsAccount().MakeTransfer(c2.ClientsAccount());
        }catch (AccountOperationException x){
            System.out.println(x.getMessage());
        }

        c1.ClientsAccount().AccountBalance();
        c2.ClientsAccount().AccountBalance();

        try {
            c1.ClientsAccount().MakePayment();
        }catch (AccountOperationException x){
            System.out.println(x.getMessage());
        }

        c1.ClientsAccount().AccountBalance();

        try {
            c1.ClientsAccount().MakeTransfer(c3.ClientsAccount());
        }catch (AccountOperationException x){
            System.out.println(x.getMessage());
        }

        c1.ClientsAccount().AccountBalance();
        c3.ClientsAccount().AccountBalance();

        try {
            c2.ClientsAccount().MakeTransfer(c4.ClientsAccount());
        }catch (AccountOperationException x){
            System.out.println(x.getMessage());
        }

        c2.ClientsAccount().AccountBalance();
        c4.ClientsAccount().AccountBalance();

        try {
            c3.ClientsAccount().MakeTransfer(c2.ClientsAccount());
        }catch (AccountOperationException x){
            System.out.println(x.getMessage());
        }

        c3.ClientsAccount().AccountBalance();
        c2.ClientsAccount().AccountBalance();

        try {
            c4.ClientsAccount().MakePayment();
        }catch (AccountOperationException x){
            System.out.println(x.getMessage());
        }

        c4.ClientsAccount().AccountBalance();

        try {
            c2.ClientsAccount().MakeTransfer(c1.ClientsAccount());
        }catch (AccountOperationException x){
            System.out.println(x.getMessage());
        }

        c2.ClientsAccount().AccountBalance();
        c1.ClientsAccount().AccountBalance();

        try {
            c4.ClientsAccount().MakeTransfer(c1.ClientsAccount());
        }catch (AccountOperationException x){
            System.out.println(x.getMessage());
        }

        c4.ClientsAccount().AccountBalance();
        c1.ClientsAccount().AccountBalance();

        try {
            c2.ClientsAccount().MakePayment();
        }catch (AccountOperationException x){
            System.out.println(x.getMessage());
        }

        c2.ClientsAccount().AccountBalance();

        try {
            c2.ClientsAccount().MakeTransfer(c3.ClientsAccount());
        }catch (AccountOperationException x){
            System.out.println(x.getMessage());
        }

        c2.ClientsAccount().AccountBalance();
        c3.ClientsAccount().AccountBalance();


        System.out.println();
        c1.ClientsAccount().AccountBalance();
        c2.ClientsAccount().AccountBalance();
        c3.ClientsAccount().AccountBalance();
        c4.ClientsAccount().AccountBalance();



    }


}
