package Task4;


import java.util.Arrays;
import java.util.Scanner;

public class Main  {


   static int[] array = new int[10];
    public static void main(String[] args) {
        for(int j=0; j<array.length; j++) {
            try {
                readNumber();


            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
            }
        }

    }





static int index=0;
    public static int readNumber() throws NegativeNumberException {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println(i);
        if (i < 0) {
            fillArray(0);
            index++;
            throw new NegativeNumberException("Negative numbers are not allowed");

        } else{
            fillArray(i);
            index++;
        }
        return i;
    }

    static void fillArray(int i){
        array[index]=i;
        System.out.println(Arrays.toString(array));
    }

}



