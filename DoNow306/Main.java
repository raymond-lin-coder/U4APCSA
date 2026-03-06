package DoNow306;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(30);
        nums.add(25);
        nums.add(40);
        nums.add(55);
        nums.add(45);
        nums.add(20);
        
        int sum = 0;

       	        // use an index-based for loop here to sum up the numbers in nums
        for(Integer num : nums) {
            sum += num;
        }
        System.out.println(sum);  // TEST: this should print 225

        ArrayList<String> words = new ArrayList<String>();        
        words.add("candle");
        words.add("dandelion");
        words.add("eagle");
        words.add("garage");
        words.add("hamburger");
        words.add("imitate");
        words.add("jello");

       	// use a for loop here to print out the words in reverse order
        for(int i = words.size() - 1; i >= 0; i--) {
            System.out.println(words.get(i));
        }
        for(int i = 0; i < words.size(); i++) {
            if (words.get(i).substring(0, 1).equals("h")) {
                break;
            }
            System.out.println(words.get(i));
        }
    }
}