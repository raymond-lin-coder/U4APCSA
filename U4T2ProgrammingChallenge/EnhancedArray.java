public class EnhancedArray {
  /** ==========Enhanced Array==========
   * We know that arrays have a fixed size, but we want to create a dynamic array 
   * that can grow and shrink as needed. This is called a dynamic array.
   * You must complete the following methods:
   * 1. size(): Returns the current number of elements in the array.
   * 2. getVal(int index): Returns the value at the specified index, 
   * or -1 if the index is out of bounds.
   * 3. add(int val): Adds a value to the end of the array.
   * 4. insert(int index, int val): Inserts a value at the specified index, 
   * shifting subsequent elements to the right. If index is out of bounds, print "Index invalid".
   * 5. remove(int index): Removes the value at the specified index, shifting subsequent 
   * elements to the left and returning the removed value.If the index is out of bounds, return -1.
   * 
   * There is some code in the main method to help you test your code.
   * 
   * **/
  private int size;
  private int[] data;
  public EnhancedArray(int size) {
    this.size = size;
    this.data = new int[size];
  }
  public int size() {
    return size;
  }
  public int getVal(int index) {
    if (index < 0 || index > data.length - 1) {
        return -1;
    }
    return data[index];
  }
  public void add(int val) {
    int[] newData = new int[size + 1];
    size = size + 1;
    for(int i = 0; i < this.data.length; i++) {
        newData[i] = this.data[i];
    }
    newData[newData.length - 1] = val;
    data = newData;
  }
  public void insert(int index, int val) {
    add(val);
    int tempVal = data[index];
    data[index] = val;
    for(int i = data.length - 1; i > index + 1; i--) {
        data[i] = data[i - 1];
    }
    data[index + 1] = tempVal;
  }
  public int remove(int index) {
    size --;
    if (index < 0 || index > data.length - 1) {
        return - 1;
    }
    int removedValue = data[index];
    data[index] = 0;
    for(int i = index; i < data.length - 1; i++) {
        data[i] = data[i + 1];
    }
    int[] newData = new int[data.length - 1];
    for(int i = 0; i < data.length - 1; i++) {
        newData[i] = data[i];
    }
    data = newData;
   return removedValue;
  }
    public int contains(int val) {
    for(int i = 0; i < data.length; i++) {
        if (data[i] == val) {
            return i;
        }
    }
    return -1;
  }
  public void reverse(){
    for(int i = 0; i < data.length / 2; i++) {
      int tempNum = data[i];
      data[i] = data[data.length - 1 - i];
      data[data.length - 1 - i] = tempNum;
    }
  }
  public void addAll(EnhancedArray other) {
    for(int i = 0; i < other.data.length; i++) {
        add(other.data[i]);
    }
  }
}