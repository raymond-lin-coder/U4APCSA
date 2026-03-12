package U4T9;

import java.util.ArrayList;



public class RemoveDuplicates {

  public RemoveDuplicates() {}

  public ArrayList<Integer> removeDuplicates(ArrayList<Integer> intList) {
    for(int i = 0; i < intList.size(); i++) {
      for(int a = i + 1; a < intList.size(); a++) {
        if (intList.get(i).equals(intList.get(a))) {
          intList.remove(a);
          a--;
        }
      }
    }
    return intList;
  }

}
