package Task2;

public class Item {

    public int ID;
    public String name;

    public Item(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }


    public void show() {
        System.out.println(name);
    }


    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
}
