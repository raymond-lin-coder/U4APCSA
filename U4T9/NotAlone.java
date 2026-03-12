package U4T9;
import java.util.ArrayList;

public class NotAlone {
  public NotAlone() {}
  public ArrayList<Integer> notAlone(ArrayList<Integer> list, int val) {
    if (list.size() < 2) {
        return list;
    }
    for(int i = 0; i < list.size(); i++) {
        if (list.get(i) == val) {
            int left = 0;
            int right = 0;
            if (i > 0) {
                left = list.get(i - 1);
            }
            if (i < list.size() - 1) {
                right = list.get(i + 1);
            }
            int max = Math.max(left, right);
            if (list.get(i) != left && list.get(i) != right && left != 0 && right != 0) {
                list.set(i, max);
            }
            else if (left == 0) {
                if (list.get(i) < right) {
                    list.set(i, right);
                }
            }
            else {
                if (list.get(i) < left) {
                    list.set(i, left);
                }
            }
        }
    }
    return list;
  }
}