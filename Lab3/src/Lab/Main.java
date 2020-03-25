package Lab;

public class Main {
        public static void main(String[]args){

            User u1=new User("er@ea.com");
            User u2=new User("Andrzej", "Barylka", "baryla@gmail.com", "passwordxD");
            User u3=new User("qwert@pj.com");
            u1.isGuestAcc();
            u1.register();

            Product p1= new Product("Toilet Paper",13.9, 5123, 54);
            Product p2= new Product("Skyrim", 36.0, 1337);
            Product p3= new Product("Aquarium", 100.00, 98712538);

            p1.changeParameters();



        }

}
