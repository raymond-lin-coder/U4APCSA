import java.util.ArrayList;

public class Sort {

    // PART A. implementing insertion sort
    public static void insertionSort(int[] elements) {
        // TODO: Part A: implement me using an outer FOR loop and an inner WHILE loop
        for (int i = 1; i < elements.length; i++) {  // iterate through list starting at index 1

            // store current element's value
            // set inner loop's index to outer loop's current index
            int current = elements[i];
            int idx = i;
            while (idx > 0 && current < elements[idx - 1]) {  // continue checking values to the left until you either reach
                // the front (index 0) of the list or you get to a value that is less
                // than the current element
                elements[idx] = elements[idx - 1];
                idx --;
                // shift the element directly to the left to the right,
                // then adjust inner loop index to the left one index
            }
            elements[idx] = current;
            // insert current element into the correct index
        }
    }

    // PART B. sorting a word list
    public static void insertionSortWordList(ArrayList<String> words) {
        // TODO: Part B: implement me like part A except sorting an arraylist of Strings
        int count = 0;
        for (int i = 1; i < words.size(); i++) {  // iterate through list starting at index 1
            // store current element's value
            // set inner loop's index to outer loop's current index
            String current = words.get(i);
            int idx = i;
            while (idx > 0 && current.compareTo(words.get(idx - 1) ) < 0) {  // continue checking values to the left until you either reach
                // the front (index 0) of the list or you get to a value that is less
                // than the current element
                words.set(idx, words.get(idx - 1));
                idx --;
                count ++;
                // shift the element directly to the left to the right,
                // then adjust inner loop index to the left one index
            }
            words.set(idx, current);
            // insert current element into the correct index
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
    }
    public static void selectionSortWordList(ArrayList<String> words) {

        // TODO: Part B: implement me
        int count = 0;
        for(int i = 0; i < words.size(); i++) {
            String current = words.get(i);
            int minimumIdx = i;
            for(int j = i + 1; j < words.size(); j++) {
                if (words.get(j).compareTo(words.get(minimumIdx)) < 0) {
                    minimumIdx = j;
                }
                count ++;
            }
            if (i != minimumIdx) {
                String temp = words.get(i);
                words.set(i, words.get(minimumIdx));
                words.set(minimumIdx, temp);
            }
        }
        System.out.println("SELECTION SORT: Number of loop iterations: " + count);
    }
}