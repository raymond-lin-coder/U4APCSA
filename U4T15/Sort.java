package U4T15;
import java.util.ArrayList;



public class Sort {



  // PART A. implementing selection sort

  public static void selectionSort(int[] elements) {

    // TODO: Part A: implement me
    for(int i = 0; i < elements.length; i++) {
      int current = elements[i];
      int minimumIdx = i;
      for(int j = i + 1; j < elements.length; j++) {
        if (elements[j] < elements[minimumIdx]) {
          minimumIdx = j;
        }
      }
      if (i != minimumIdx) {
        int temp = elements[i];
        elements[i] = elements[minimumIdx];
        elements[minimumIdx] = temp;
      }
    }
  }



  // PART B. sorting a 1000-word list

  public static void selectionSortWordList(ArrayList<String> words) {

    // TODO: Part B: implement me
    for(int i = 0; i < words.size(); i++) {
      String current = words.get(i);
      int minimumIdx = i;
      for(int j = i + 1; j < words.size(); j++) {
        if (words.get(j).compareTo(words.get(minimumIdx)) < 0) {
          minimumIdx = j;
        }
      }
      if (i != minimumIdx) {
        String temp = words.get(i);
        words.set(i, words.get(minimumIdx));
        words.set(minimumIdx, temp);
      }
    }
  }

}