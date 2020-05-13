package TuT;

public class Car extends Vehicle {

    private int numberOfSeats;

    public Car(){
        this.numberOfSeats= numberOfSeats;

    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void start(){
        System.out.println("Engine Starts Again");
    }
    @Override
    public void stop(){
        System.out.println("Engine Stops Again");
    }
    public void start1(){
        super.start();
    }

    public void stop1(){
        super.stop();
    }
}
