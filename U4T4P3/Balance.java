package U4T4P3;

public Balance(){}



public boolean canBalance(int[] numList) {

//implements here
    boolean splittable = false;
    for(int i = 1; i < numList.length; i++) {
        int firstPartSum = 0;
        int secondPartSum = 0;
        for(int a = 0; a <= i; a++) {
            firstPartSum += numList[a];
        }
        for(int b = i + 1; b < numList.length; b++) {
            secondPartSum += numList[b];
        }
        if (firstPartSum == secondPartSum) {
            splittable = true;
        }
    }
    return splittable;
}

}
