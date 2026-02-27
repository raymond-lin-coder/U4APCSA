package U4T4P3;
public class duplicates{

public duplicates(){}


public boolean hasDuplicates(int[] numList) {

//implements here
    for(int i = 0; i < numList.length; i++) {
        for(int a = 0; a < numList.length; a++) {
            if (i != a && numList[i] == numList[a] ) {
                return true;
            }
        }
    }
    return false;
}
}