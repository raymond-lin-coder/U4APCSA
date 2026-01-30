public class ArrayAlgorithms {
    private ArrayAlgorithms() {}
 /** Returns the average of all values in numList as a double.

   *

   * PRECONDITION: numList.length > 0

   */

  public static double average(int[] numList) {

    // IMPLEMENT ME
    double total = 0;
    for(int i = 0; i < numList.length; i++) {
        total += numList[i];
    }
    return total / numList.length;
  }
  /** Returns the value in numList that represents the minimum

   * value in numList.

   *

   *  PRECONDITION: numList.length > 0

   */

  public static int minimum(int[] numList) {
    // IMPLEMENT ME
    int minimum = numList[0];
    for(int i = 1; i < numList.length; i++) {
        if (numList[i] < minimum) {
            minimum = numList[i];
        }
    }
    return minimum;
  }
  /** Returns the number of Strings in strList that contain the target.

   *

   * PRECONDITION: strList.length > 0

   */

  public static int howManyContain(String[] strList, String target) {

    // IMPLEMENT ME
    int howManyContain = 0;
    for(int i = 0; i < strList.length; i++) {
        if (strList[i].indexOf(target) != -1) {
            howManyContain ++;
        }
    }
    return howManyContain;
  }
   /** Returns an array containing all characters in myStr, in order.

   *

   *  PRECONDITION: myStr.length() > 0

   */

  public static String[] stringToArray(String myStr) {

    // IMPLEMENT ME
    String[] strArray = new String[myStr.length()];
    for(int i = 0; i < myStr.length(); i++) {
        strArray[i] = myStr.substring(i, i + 1);
    }
    return strArray;
  }
   /** This method checks each Person in the people array, and if they

    * are an adult (at least 18 years old), they introduce themselves

    * (i.e. by calling the introduce() method)

    *

    * PRECONDITION: people.length > 0

    */

  public static void introduceAdults(Person[] people) {

    // IMPLEMENT ME!
    for(int i = 0; i < people.length; i++) {
        if (people[i].getAge() >= 18) {
            people[i].introduce();
        }
    }
  }
  /** Prints each String in wordList, on its own line, in reverse order;

   *  the characters of each string are also reversed.

   *

   *  PRECONDITION: wordList.length > 0

   */

  public static void reversePrint(String[] wordList) {

    // IMPLEMENT ME
    for(int i = wordList.length - 1; i >= 0; i--) {
        for(int x = wordList[i].length() - 1; x >= 0; x--) {
            System.out.print(wordList[i].substring(x, x + 1));
        }
        System.out.println();
    }
  }
  /** Returns a new array containing all elements from arr1 combined with 

   * all elements from arr2; arr1's elements should be followed by

   * arr2's elements

   *

   * PRECONDITION: arr1.length > 0, arr2.length > 0

   */

  public static int[] combine(int[] arr1, int[] arr2) {

    // IMPLEMENT ME
    int[] newArray = new int[arr1.length + arr2.length];
    for (int i = 0; i < arr1.length; i++) {
        newArray[i] = arr1[i];
    }
    for(int i = 0; i < arr2.length; i++) {
        newArray[i + arr1.length] = arr2[i];
    }
    return newArray;
  }
}
