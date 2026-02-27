package U4T4P3;

public class FindMode{

public FindMode(){}



public static int mode(int[] numList) {

//implements here
    int mode = 0;
    int valueOfMode = Integer.MAX_VALUE;
    int counter = 1;
    for(int i = 0; i < numList.length; i++) {
        for(int a = 0; a < numList.length; a++) {
            if (i != a && numList[a] == numList[i]) {
                counter++;
            }
        }
        if (counter > mode && numList[i] < valueOfMode) {
                mode = counter;
                valueOfMode = numList[i];
            }
        counter = 1;
    }
    return valueOfMode;
}

}