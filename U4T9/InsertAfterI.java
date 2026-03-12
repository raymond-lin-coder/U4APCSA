package U4T9;
import java.util.ArrayList;
public class InsertAfterI {

  public InsertAfterI() {}
  public void insertAfterI(ArrayList<String> stringList, String str) {
    for(int i = 0; i < stringList.size(); i++) {
        if (stringList.get(i).indexOf("i") != -1 || stringList.get(i).indexOf("I") != -1) {
            stringList.add(i + 1, str);
            i++;
        }
    }
  }
}
