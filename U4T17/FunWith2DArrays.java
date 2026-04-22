package U4T17;

public class FunWith2DArrays {
    public static int totalElements (int[][] arr) {
        int totalElements = 0;
        for(int i = 0; i < arr.length; i++) {
            totalElements += arr[i].length;
        }
        return totalElements;
    }
}
