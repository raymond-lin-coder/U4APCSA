public class EnhancedArrayRunner {
      public static void main(String[] args) {
    EnhancedArray a = new EnhancedArray(0);
    System.out.println("Initial size expected 0: " + a.size());
    a.add(10);
    a.add(20);
    a.add(30);
    System.out.print("After adds expected [10, 20, 30]: ");
    for (int i = 0; i < a.size(); i++) {
      System.out.print((" " + a.getVal(i)));
    }
    System.out.println();
    a.insert(1, 15);
    System.out.print("After insert expected [10, 15, 20, 30]: ");
    for (int i = 0; i < a.size(); i++) {
      System.out.print(" "+ a.getVal(i));
    }
    System.out.println();
    int removed = a.remove(2);
    System.out.println("Removed expected 20: " + removed);
    System.out.print("After remove expected [10, 15, 30]: ");
    for (int i = 0; i < a.size(); i++) {
      System.out.print(" " + a.getVal(i));
    }
    System.out.println();
    System.out.println("getVal(1) expected 15: " + a.getVal(1));
    System.out.println("getVal(10) expected -1: " + a.getVal  (10));
  }
}
