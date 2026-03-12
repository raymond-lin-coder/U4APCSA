package U4T9;

import java.util.ArrayList;


public class MoveBWords {

  public MoveBWords() {}

  public ArrayList<String> moveBWords(ArrayList<String> wordList) {
    int position = 0;
    for(int i = 0; i < wordList.size(); i++) {
        if (wordList.get(i).substring(0, 1).equals("b") || wordList.get(i).substring(0, 1).equals("B")) {
            String temp = wordList.get(i);
            wordList.remove(i);
            wordList.add(position, temp);
            position++;
        }
    }
    return wordList;
  }
}