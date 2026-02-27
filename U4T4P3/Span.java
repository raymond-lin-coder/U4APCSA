package U4T4P3;

public class Span{

public Span(){}



public int maxSpan(int[] numList) {

//implements here
    int maxSpan = 0;
    int indexOfLastSameValue = 0;
    int currentSpan = 0;
    for(int i = 0; i < numList.length; i++) {
        for(int a = 0; a < numList.length; a++) {
            if (i != a && numList[a] == numList[i]) {
                indexOfLastSameValue = a;
            }
        }
        currentSpan = indexOfLastSameValue + 1 - i;
            if (currentSpan > maxSpan) {
                maxSpan = currentSpan;
            }
        indexOfLastSameValue = 0;
    }
    return maxSpan;
}

}