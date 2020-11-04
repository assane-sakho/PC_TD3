package exo;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
       try
       {
           List<Double> vals = new ArrayList();
           Race r = new Race();

           for(int i = 0; i < 1000000; i ++)
               vals.add(r.go());

           double result = vals.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
           System.out.println(result);
       }
      catch (InterruptedException e) {
           e.printStackTrace();
       }
    }
}
