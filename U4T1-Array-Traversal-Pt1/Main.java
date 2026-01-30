public class Main {
    public static void main(String[] args) {
  // 1. create five Person objects with these names and ages:
    //  Bob, 21
    //  Nancy, 17
    //  Tim, 16
    //  Andrew, 18
    //  Sarah, 19
    Person p1 = new Person("Bob", 21);
    Person p2 = new Person("Nancy", 17);
    Person p3 = new Person("Tim", 16);
    Person p4 = new Person("Andrew", 18);
    Person p5 = new Person("Sarah", 19);
    // 2. add them to a new Person[] array in the order shown above
    Person[] personArray = {p1, p2, p3, p4, p5};
    // 3. call the static method and pass the array in as the parameter
    ArrayAlgorithms.introduceAdults(personArray);
    String[] words = {"apple", "banana", "cabana", "diva", "elephant"};

ArrayAlgorithms.reversePrint(words);

System.out.println();

String[] words2 = {"123", "456", "789",};

ArrayAlgorithms.reversePrint(words2);
int[] nums1 = {1, 2, 3, 4, 5, 6};

int[] nums2 = {10, 11, 12, 13, 14, 15, 16, 17};

int[] combined = ArrayAlgorithms.combine(nums1, nums2);

for (int i = 0; i < combined.length; i++) {

    System.out.print(combined[i] + " ");

}

System.out.println();

System.out.println("combined list has " + combined.length + " elements");



int[] nums3 = {5, 8, 6, 2};

int[] nums4 = {1, 7, 10, 0, 9};

int[] combined2 = ArrayAlgorithms.combine(nums3, nums4);

for (int i = 0; i < combined2.length; i++) {

    System.out.print(combined2[i] + " ");

}

System.out.println();

System.out.println("combined list has " + combined2.length + " elements");



    }
}