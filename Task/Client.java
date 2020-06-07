package Task;

public class Client extends User{

    static int ClientID = 0;
    public String ID1;
    boolean HasAccount = false;
    public BankAccount bankAccount = new BankAccount(this);


    public Client(String name, String surname) {
        super(name, surname);
        ClientID++;
        ID1= " Clt. " +  ClientID;
    }

    public BankAccount ClientsAccount(){
        if (HasAccount=true){
            return bankAccount;
        } else {
            return null;
        }
    }



}
