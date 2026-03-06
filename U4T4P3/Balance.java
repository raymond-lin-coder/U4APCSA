package U4T4P3;
public class Balance{
public Balance() {}



public boolean canBalance(int[] numList) {

//implements here
    for(int i = 1; i < numList.length; i++) {
        int firstPartSum = 0;
        int secondPartSum = 0;
        for(int a = 0; a < i; a++) {
            firstPartSum += numList[a];
        }
        for(int b = i; b < numList.length; b++) {
            secondPartSum += numList[b];
        }
        if (firstPartSum == secondPartSum) {
            return true;
        }
    }
    return false;
}

}
