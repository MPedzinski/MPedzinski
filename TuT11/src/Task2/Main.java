package Task2;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.List;



public class Main {
    public static void main(String[]args) {

        Map<Integer, String> map = new HashMap<>();
        HashSet<Item> hashSet = new HashSet<>();

        Item i1 = new Item(13, "Chair");
        Item i2 = new Item(16, "Spoon");
        Item i3 = new Item(17, "Flamethrower");
        Item i4 = new Item(11, "Aquarium");
        Item i5 = new Item(12, "Basketball");

        ArrayList<Item> items = new ArrayList<>();
        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        items.add(i5);


        i1.show();
        i2.show();
        i3.show();
        i4.show();
        i5.show();

        System.out.println();

        for (Item i : items) {
            map.put(i.getID(), i.getName());
        }

        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
             System.out.println();


        Item i6 = new Item(5, "Konger TeleCarp");
        Item i7 = new Item(76, "Overwatch");
        Item i8 = new Item(7, "Kobe Jersey");
        Item i9 = new Item(21, "21 SAVAGE Album");
        Item i10 = new Item(3, "D.Wade Painting");
        Item i11 = new Item(6, "Red Wine");
        Item i12 = new Item(4, "Chillwagon");
        Item i13 = new Item(23, "The Last Dance");
        Item i14 = new Item(14, "Microphone");
        Item i15 = new Item(9, "Warhammer 40k");


        items.add(i6);
        items.add(i7);
        items.add(i8);
        items.add(i9);
        items.add(i10);
        items.add(i11);
        items.add(i12);
        items.add(i13);
        items.add(i14);
        items.add(i15);



        try {
            List<Item> sublist = items.subList(6, 11);
            for (Item i : sublist) {
                hashSet.add(i);
            }
        }
        catch(IndexOutOfBoundsException e){
                System.out.println("Exception thrown : " + e);
            }

        catch(IllegalArgumentException e){
                System.out.println("Exception thrown : " + e);
            }


        for (Item i : items) {
            map.put(i.getID(), i.getName());
        }

        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());


        }
    }

