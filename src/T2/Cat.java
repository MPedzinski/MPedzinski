package T2;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
        this.name=name;
    }
    @Override
    public String getType() {
        String type = "Catto";
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void start() {
        System.out.println(" Cat started running");

    }

    @Override
    public void stop() {
        System.out.println(" Cat stopped");

    }
}
