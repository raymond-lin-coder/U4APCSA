package U4T9;
import java.util.ArrayList;
public class RemoveThree {

  public RemoveThree() {}
  public void removeThree(ArrayList<String> stringList) {
    for(int i = 0; i < stringList.size(); i++) {
        if (stringList.get(i).length() == 3) {
            stringList.remove(i);
            i--;
        }
    }
  }
}