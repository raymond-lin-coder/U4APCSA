package U4T9;
import java.util.ArrayList;
public class DuplicateUpperEnd {
  public DuplicateUpperEnd() {}
  public ArrayList<String> duplicateUpperEnd(ArrayList<String> wordList) {
    int size = wordList.size();
    for(int i = 0; i < size; i++) {
        wordList.add(wordList.get(i).toUpperCase());
    }
    return wordList;
  }
}
