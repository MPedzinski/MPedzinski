package Task;

public interface AccountOperations {


    void AccountBalance();
    void MakeTransfer(BankAccount bankAccount) throws AccountOperationException;
    void MakePayment() throws  AccountOperationException;




}
