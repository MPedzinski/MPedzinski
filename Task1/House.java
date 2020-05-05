package Task1;

import java.util.ArrayList;

public class House {

    ArrayList<Room> numofrooms = new ArrayList<>();
    String address;
    static House h1 = new House("");


    private House(String address) {
        this.address = address;
    }

    public void addRoom(Room r) {
        numofrooms.add(r);
    }

    public void addRome(ArrayList<Room> r) {
        for (int z = 0; z < r.size(); z++) {
            numofrooms.add(r.get(z));
        }
    }
        public int getRoomCount(){
            int t = 0;
            for (int h = 0; h < numofrooms.size(); h++) {
                t += 1;
            }
            return t;
        }

    public static House createHouse(String adres) {
        h1.address=adres;
        return h1;
    }
    }

