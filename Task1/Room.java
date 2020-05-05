package Task1;

import java.util.ArrayList;

public class Room{
    private int area;
    private ArrayList<Furniture> rooms= new ArrayList<>();

            public void add(Furniture f){
                rooms.add(f);
            }

            public Room(){
            }

            public Room(int area){
              this.area=area;
            }

    public int Price(){
                int pricee=0;
                for(int i=0; i<rooms.size(); i++){
                    pricee += rooms.get(i).getPrice(false);
                }return pricee ;


    }

}
