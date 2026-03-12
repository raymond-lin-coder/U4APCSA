package U4T9;
import java.util.ArrayList;
public class Modes {

  public Modes() {}



  public ArrayList<Integer> modes(int[] numList) {
    ArrayList<Integer> occurences = new ArrayList<Integer>();
    ArrayList<Integer> alreadyCheckedList = new ArrayList<Integer>();
    for(int i = 0; i < numList.length; i++) {
      boolean alreadyChecked = false;
      if (alreadyCheckedList.contains(numList[i])) {
        alreadyChecked = true;
      }
      else {
        alreadyCheckedList.add(numList[i]);
      }
      int count = 0;
      for(int a = 0; a < numList.length; a++) {
        if (numList[a] == numList[i]) {
          count++;
        }
      }
      if (alreadyChecked) {
        count = 0;
      }
      occurences.add(count);
    }
    int maxCount = 0;
    for(int i = 0; i < occurences.size(); i++) {
      if (occurences.get(i) > maxCount) {
        maxCount = occurences.get(i);
      }
    }
    ArrayList<Integer> finalList = new ArrayList<Integer>();
    if (maxCount == 1) {
      return finalList;
    }
    for(int i = 0; i < occurences.size(); i++) {
      if (occurences.get(i) >= maxCount) {
        finalList.add(numList[i]);
      }
    }
    return finalList;
  }

}