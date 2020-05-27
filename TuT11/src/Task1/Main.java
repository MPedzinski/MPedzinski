package Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {


       ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Audi TT", 1999));
        cars.add(new Car("Ford GT40", 1966));
        cars.add(new Car("Lamborghini Huracan", 2019));
        cars.add(new Car("Mazda MX-5", 2016));
        cars.add(new Car("Porshe 911", 2005));
        cars.add(new Car("Toyota Supra", 2005));
        cars.add(new Car("Smart Roadster", 2003));
        cars.add(new Car("Ferrari FXX", 2007));
        cars.add(new Car("Bugatti Chiron", 2019));
        cars.add(new Car("Jaguar E-Type", 1964));
        cars.add(new Car("Lykan Hypersport", 2015));

        Collections.sort(cars);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).name + "-" + cars.get(i).yearOfProduction);
        }

    }


}

