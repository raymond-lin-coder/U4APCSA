package U4T9;
import java.util.ArrayList;

public class ParseSentence {
  public ParseSentence() {}
  public ArrayList<String> parseSentence(String sentence) {
    ArrayList<String> stringList = new ArrayList<String>();
    String temp = "";
    for(int i = 0; i < sentence.length(); i++) {
        if (sentence.substring(i, i + 1).equals(" ")) {
            stringList.add(temp);
            temp = "";
        }
        else {
            temp += sentence.substring(i, i + 1);
        }
        
    }
    stringList.add(temp);
    return stringList;
  }
}