package U4T9;
import java.util.ArrayList;

public class ZeroFront {
  public ZeroFront() {}
  public void zeroFront(ArrayList<Integer> list) {
    int zeroCount = 0;
    for(int i = 0; i < list.size(); i++) {
        if (list.get(i) == 0) {
            zeroCount++;
            list.remove(i);
            i--;
        }
    }
    for(int i = 0; i < zeroCount; i++) {
        list.add(0, 0);
    }

  }

}