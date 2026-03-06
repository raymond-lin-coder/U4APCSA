package U4T4P3;

public class Span{

public Span(){}

public static int maxSpan(int[] numList) {

//implements here
    int maxSpan = 0;
    for(int i = 0; i < numList.length; i++) {
        int indexOfLastSameValue = i;
        for(int a = i + 1; a < numList.length; a++) {
            if (numList[a] == numList[i]) {
                indexOfLastSameValue = a;
            }
        }
        boolean onlyValue = true;
        for(int b = 0; b < numList.length; b++) {
            if (numList[i] == numList[b]) {
                onlyValue = false;
            }
        }
        int currentSpan;
        if (onlyValue) {
            currentSpan = 1;
        }
        else{
            currentSpan = indexOfLastSameValue + 1 - i;
        }
        if (currentSpan > maxSpan) {
            maxSpan = currentSpan;
        }
    }
    return maxSpan;
}

}