package Task1;

public class Car implements Comparable<Car> {

 public  String name;
 public int yearOfProduction;

    public Car(String name, int yearOfProduction) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
    }

    public String getName() {
        return name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public int compareTo(Car cars) {
        return (this.yearOfProduction)-(cars.yearOfProduction);
    }


}
