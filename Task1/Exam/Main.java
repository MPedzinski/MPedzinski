package Exam;

public class Main {
    public static void main(String[]args){


        Policeman pol1= new Policeman(1, "Andrew", "Scott", "ascott1");
        Policeman pol2= new Policeman(2, "Will", "Burke", "wburke2");
        Policeman pol3= new Policeman(3, "Mike", "Epps", "mepps3");
        Policeman pol4= new Policeman(4, "Gilbert", "Arenas", "garenas4");
        Policeman pol5= new Policeman(5, "John", "Brown", "jbrown5");
        Policeman pol6= new Policeman(6, "Rowan", "Atkinson", "ratkinson6");


        pol1.activate();
        pol2.activate();
        pol3.activate();
        pol5.activate();
        pol6.activate();


        pol5.displayInfo();
        System.out.println(" There are " + pol4.polAdded() + " policeman");
        System.out.println(" There are " + pol1.getActive() + " active policeman");
    }
}
