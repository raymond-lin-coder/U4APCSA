package U4T3;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Mateo", "Sofia", "David", "Ziggy", "Charlie"};
        for(String name : names) {
            System.out.println(name);
        }
        int[] nums = {8, 4, 10, 5, 7, 11, 3, 9, 23, 6};
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
