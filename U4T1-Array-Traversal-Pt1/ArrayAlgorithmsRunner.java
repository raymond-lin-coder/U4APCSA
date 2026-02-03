public class ArrayAlgorithmsRunner {
    public static void main(String[] args) {
int[] nums = {5, 1, 3, 4, 7, 6};

ArrayAlgorithms.shiftLeft(nums);

// original nums array IS modified; all elements shifted left 1

for (int i = 0; i < nums.length; i++) {

    System.out.print(nums[i] + " ");

}

System.out.println();

int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8};

ArrayAlgorithms.shiftLeft(nums2);

// original nums2 array IS modified; all elements shifted left 1

for (int i = 0; i < nums2.length; i++) {

    System.out.print(nums2[i] + " ");

}

System.out.println();

// shift nums2 AGAIN:

ArrayAlgorithms.shiftLeft(nums2);

for (int i = 0; i < nums2.length; i++) {

    System.out.print(nums2[i] + " ");

}

System.out.println();

// shift nums2 A THIRD TIME:

ArrayAlgorithms.shiftLeft(nums2);

for (int i = 0; i < nums2.length; i++) {

    System.out.print(nums2[i] + " ");

}

    }
}
