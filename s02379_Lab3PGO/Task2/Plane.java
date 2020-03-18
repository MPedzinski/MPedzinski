package Task2;
import java.util.Scanner;
public class Plane {
    Scanner scan= new Scanner(System.in);

    private String brand;
    private int seats;

        public Plane(String brand, int seats){
            this.brand=brand;
            this.seats=seats;

        }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeats() {
        return seats;
    }
        public void insertSeats(){
            System.out.println("Insert number of seats");
        }
    public void setSeats(int seats) {
        this.seats = scan.nextInt();
    }

}
