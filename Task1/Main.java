package Task1;

public class Main {
    public static void main(String[]args){

            House h1=House.createHouse("Malibu 27");

            Furniture f1=new Furniture("stool", 49.99);
            Furniture f2=new Furniture("Desk", 399.99);
            Furniture f3=new Furniture("Bed", 759.99);


            Room r1=new Room(34);
            Room r2=new Room(231);
            Room r3=new Room(23);

            h1.addRoom(r2);
            h1.addRoom(r3);

            r1.add(f1);
            r1.add(f2);

            System.out.println("Your home has " + h1.getRoomCount() + " rooms, and the furniture costs " + r1.Price() + " $.");






    }
}
