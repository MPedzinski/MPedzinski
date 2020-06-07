package Task;

public class Transaction {

    public double AmountOfTransaction;
    public Client sendfrom;
    public Client receivedby;

    public Transaction(double amountOfTransaction, Client sendfrom, Client receivedby) {
        AmountOfTransaction = amountOfTransaction;
        this.sendfrom = sendfrom;
        this.receivedby = receivedby;
    }

}
