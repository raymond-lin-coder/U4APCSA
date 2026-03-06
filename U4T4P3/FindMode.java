package U4T4P3;

public class FindMode{

public FindMode(){}



public static int mode(int[] numList) {

//implements here
    int mode = 0;
    int valueOfMode = Integer.MAX_VALUE;
    for(int i = 0; i < numList.length; i++) {
        int counter = 0;
        for(int a = 0; a < numList.length; a++) {
            if (numList[a] == numList[i]) {
                counter++;
            }
        }
        if (counter > mode) {
                mode = counter;;
            }
    }
    if (mode == 1) {
        int lowestValue = Integer.MAX_VALUE;
        for(int z = 0; z < numList.length; z++) {
            if (numList[z] < lowestValue) {
                lowestValue = numList[z];
            }
        }
        return lowestValue;
    }
    int smallestMode = Integer.MAX_VALUE;
    for (int i = 0; i < numList.length; i++) {
        int count = 0;
        for (int j = 0; j < numList.length; j++) {
            if (numList[j] == numList[i]) {
                count++;
            }
        }
        if (count == mode && numList[i] < smallestMode) {
            smallestMode = numList[i];
        }
    }
    if (mode == 0) {
        return 0;
    }
    return smallestMode;
}

}