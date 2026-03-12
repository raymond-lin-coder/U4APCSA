package U4T9;
import java.util.ArrayList;

public class SwapEnds {
  public SwapEnds() {}
  public ArrayList<Integer> swapEnds(ArrayList<Integer> list) {
    if (list.size() < 2) {
        return list;
    }
    int temp = list.set(0, list.get(list.size() - 1));
    list.set(list.size() - 1, temp);
    return list;
  }
}