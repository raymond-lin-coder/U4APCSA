package U4T9;
import java.util.ArrayList;



public class ShiftLeft {

  public ShiftLeft() {}



  public ArrayList<Integer> shiftLeft(ArrayList<Integer> list) {
    if (list.size() < 2) {
      return list;
    }
    int temp = list.remove(0);
    list.add(temp);
    return list;
  }

}