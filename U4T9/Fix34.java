package U4T9;
import java.util.ArrayList;



public class Fix34 {

  public Fix34() {}



  public static ArrayList<Integer> fix34(ArrayList<Integer> list) {
    for(int i = 0; i < list.size(); i++) {
        if (list.get(i) == 3 && list.get(i + 1) != 4) {
            for(int a =  0; a < list.size(); a++) {
                int previous = 0;
                if (a > 0) {
                previous = list.get(a - 1);
                }
                if (list.get(a) == 4 && previous != 3) {
                    int temp = list.set(i + 1, 4);
                    list.set(a, temp);
                }
            }
        }
    }
    return list;

  }

}