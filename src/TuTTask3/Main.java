package TuTTask3;

public class Main {
    public static void main(String[]args){

        Lion l=new Lion();
        Cat c=new Cat();
        Wolf w=new Wolf();
        Dog d=new Dog();

        l.makeNoise();
        c.makeNoise();
        w.makeNoise();
        d.makeNoise();
        c.roam();
        d.roam();

    }
}
