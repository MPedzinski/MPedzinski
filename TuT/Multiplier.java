package TuT;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class Multiplier {

    private int x;
    private int y;
    private int q;
    private int w;
    private double u;
    private double i;
    private BigDecimal o;
    private BigDecimal p;
    List<Integer> listi= new ArrayList<Integer>();

                public int multiply(int x,int y){
                    return x*y;
                }

                public double multiply(double u,double i){
                    return u*i;
                }
                public int multiply(int x, int y, int q, int w){
                int v= x*y;
                int b= q*w;
                return v*b;

                }

                public BigDecimal multiply(BigDecimal o, BigDecimal p){
                return multiply(o,p);
                }

                public static int multiply(ArrayList<Integer> listi){
                    int s=1;
                    for(int n=0; n<listi.size(); n++ ){
                        s*=listi.get(n);
                    }
                    return s;
                }


    }


