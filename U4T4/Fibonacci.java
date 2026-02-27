package U4T4;

public class Fibonacci {
  // instance variable
  private int[] sequence;
  /** Constructor: sets sequence to an array containing the first seqLen numbers
      in a Fibonacci sequence. A Fibonacci sequence is formed by summing the
      previous two numbers to generate the next number,
      e.g. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34…
      All Fibonacci sequences start out with 0 and 1 as the first two numbers.
      PRECONDITION: seqLen >= 2
    */
  public Fibonacci(int seqLen) {
    /* implement me */
    sequence = new int[seqLen];
    sequence[0] = 0;
    sequence[1] = 1;
    for(int i = 2; i < sequence.length; i++) {
        sequence[i] = sequence[i - 2] + sequence[i - 1];
    }
  }
  /** Getter method: returns a reference to the sequence array
    */
  public int[] getSequence() {
    /* implement me */
    return sequence;
  }
  /** Returns the index in the array where a particular value, searchVal, is
      located in sequence; if not found, returns -1.  If searchVal == 1, return
      first index where 1 is found (since this value appears twice in Fibonacci
      sequences longer than 2 numbers)
   */
  public int getIndexOf(int searchVal) {
    /* implement me */
    if (searchVal == 1) {
      for(int i = 0; i < sequence.length; i++) {
        if (sequence[i] == 1) {
          return i;
        }
      }
    }
    for(int i = 0; i < sequence.length; i++) {
              if (sequence[i] == searchVal) {
                          return i;
                                  }
                                      }
    }
    return -1;
  }
/** Returns a String representing the array of ints as a
   *  printable String, including open and closing brackets,
   *  with values separated by commas.
   *
   *  For example, if numList is [4, 7, 3], this method should return the
   *  String: "[4, 7, 3]" (with brackets and commas in between)
   *
   *  PRECONDITION: numList.length > 0
* this class is already implemented for you to use
   */
  public static String printableString(int[] numList) {
    String str = "[";
    // iterate through all elements, EXCEPT the last one (which we will
    // append after the loop); so terminate loop when i < numList - 1
    for (int i = 0; i < numList.length - 1; i++) {
      str += numList[i];
      str += ", ";
    }
    int lastIndex = numList.length - 1;
    str += numList[lastIndex];
    str += "]";
    return str;
  }
  /** Assigns sequence to a new array that extends the current sequence by
      howManyMore numbers of the Fibonnaci sequence
      For example, if sequence is {0, 1, 1, 2, 3, 5} and this method is called
      with howManyMore = 3, sequence would be assigned to a new array with
      the next 3 Fibonacci numbers added: {0, 1, 1, 2, 3, 5, 8, 13, 21}
   */
  public void extendBy(int howManyMore) {
    /* implement this method */
    int[] extendedSequence = new int[sequence.length + howManyMore];
    for(int i = 0; i < sequence.length; i++) {
        extendedSequence[i] = sequence[i];
    }
    for(int i = sequence.length; i < extendedSequence.length; i++) {
        extendedSequence[i] = extendedSequence[i - 2] + extendedSequence[i - 1];
    }
  }
  /** Returns a string that represents the sequence array nicely formatted, for
   *  example, if sequence == [2, 3, 7], this method should return the String
   *  "[2, 3, 7]"
   *  USE THE printableString method above
   */
  public String fibonacciString() {
    /* implement this method using the utility class */
    return printableString(sequence);
  }
}