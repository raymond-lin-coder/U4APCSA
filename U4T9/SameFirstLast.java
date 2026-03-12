package U4T9;

import java.util.ArrayList;

public class SameFirstLast {
  public SameFirstLast() {}
  public boolean sameFirstLast(ArrayList<Integer> list) {
    if (list.size() < 1) {
        return false;
    }
    if (list.get(0) == list.get(list.size() - 1)) {
        return true;
    }
    return false;
  }
}
