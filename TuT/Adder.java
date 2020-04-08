package TuT;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class Adder {

    private int l;
    private int k;
    List<BigDecimal> lists = new ArrayList<BigDecimal>();


                public int add(int l, int k){
                    return l+k;
                }

    public static BigDecimal multiply(ArrayList<Integer> lists){
        BigDecimal s= BigDecimal.valueOf(1);
        for(int n=0; n<lists.size(); n++ ){
            s=s.add(lists.get(n));
        }
        return s;
    }

}
