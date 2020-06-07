package Task;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankAccount implements AccountOperations{

    Scanner scan=new Scanner(System.in);

    double AccBalance = 0;
    public Client AccOwner;
    ArrayList<Transaction> TransactionData = new ArrayList<>();



    public BankAccount(Client accOwner) {
        AccOwner = accOwner;
        this.AccBalance=AccBalance;
    }
    public void MakeDeposit() {
        System.out.println(AccOwner.name + " " + AccOwner.surname);
        System.out.println("How much money do you want to deposit?");
        System.out.println("Your current account balance = " + AccBalance);
        double cash =scan.nextDouble();
        this.AccBalance=AccBalance + cash;


    }

    @Override
    public void AccountBalance() {
        System.out.println("This User-" + AccOwner.name + " " + AccOwner.surname +" has : " + AccBalance);
    }

    @Override
    public void MakeTransfer(BankAccount bankAccount) throws AccountOperationException  {
        System.out.println(AccOwner.name + " " + AccOwner.surname);
        System.out.println("How much money do you want to transfer?");
        System.out.println("Your current account balance = " + AccBalance);
        double cash =scan.nextDouble();

        if (cash>AccBalance){
            throw new AccountOperationException("You don't have funds to perform this operation");
        } else{
            this.AccBalance=AccBalance - cash;
            TransactionData.add(new Transaction( cash, AccOwner, bankAccount.AccOwner));
            bankAccount.AccBalance= bankAccount.AccBalance + cash;

        }

    }

    @Override
    public void MakePayment() throws AccountOperationException{
        System.out.println("How much money do you want to pay?");
        System.out.println("Your current account balance = " + AccBalance);
        double cash =scan.nextDouble();
        if (cash>AccBalance) {
            throw new AccountOperationException("You don't have funds to perform this operation");
        }else{
        this.AccBalance=AccBalance - cash;
        TransactionData.add(new Transaction( cash, AccOwner, null));
        }

    }

    public void DisplayTransaction() {
        for(int i = 0; i < TransactionData.size(); i++) {
            System.out.print(TransactionData.get(i));
        }
    }
    }

