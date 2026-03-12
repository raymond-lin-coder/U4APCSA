package U4T9;
import java.util.ArrayList;
public class ReverseArray {
  public ReverseArray() {}
  public ArrayList<Integer> reverseArray(int[] intList) {
    ArrayList<Integer> intArrayList = new ArrayList<Integer>();
    for(int i = intList.length - 1; i >= 0; i--) {
        intArrayList.add(intList[i]);
    }
    return intArrayList;
  }
}