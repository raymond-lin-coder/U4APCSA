package U4T4P3;

public class primes{



public primes(){}


public int howManyPrimes(int[] numList) {

//implements here
    int primeCount = 0;
    for(int i = 0; i < numList.length; i++) {
        if (numList[i] < 2) {
            continue;
        }
        boolean isPrime = true;
        if (numList[i] == 1) {
                isPrime = false;
            }
        for(int a = 2; a < numList[i]; a++) {
            if (numList[i] % a == 0) {
                isPrime = false;
            }
        }
        if (numList[i] == 2) {
            isPrime = true;
        }
        if (isPrime) {
                primeCount++;
            }
    }
    return primeCount;
}

}
