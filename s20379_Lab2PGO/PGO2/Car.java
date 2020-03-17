package PGO2;

import java.util.Scanner;
public class Car{
            Scanner cars= new Scanner(System.in);

    String color;
    String brand;
    double engineCapacity;

        public Car(String color, String brand, double engineCapacity){

            this.color = color;
            this.brand = brand;
            this.engineCapacity = engineCapacity;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

        public void carInfo (){
            System.out.println("This car is a " +color+ " " +brand);
        }

        public void engineExt(){
            System.out.println(" Your current engine capacity is " +engineCapacity);
            System.out.println(" Type your desired engine capacity extention.");
            double engineExtention = cars.nextDouble();
            this.engineCapacity = engineCapacity + engineExtention;

            System.out.println(" Nice, now your engine is " + engineCapacity+ " litres.");
        }

        public void isHighSpeed(){
            if (engineCapacity > 2){
                System.out.println(" You have a high speed engine sir");
            }else{
                System.out.println(" You have a normal speed engine");
            }



        }



}