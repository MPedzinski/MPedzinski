package PGO1;

public class Phone {

    String brand;
    int number;
    double resolution;
    String SMS;

    public Phone(String brand, int number, double resolution) {

        this.brand = brand;
        this.number = 888999123;
        this.resolution = resolution;
        this.SMS = "calling all autobots";
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSMS() {
        return SMS;
    }

    public void displayNumber() {
        System.out.println(" Your number is " + this.number);
    }
    public void sendMessage(){
        System.out.println(" Sending the message '" + SMS + "' to " + number);
    }

}