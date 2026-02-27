package U4T3;

public class Main2 {
   public static void main(String[] args) {
      int[ ] values = {6, 2, 1, 7, 12, 5};
      for (int i=0; i < values.length; i++) {
         if (values[i] % 2 == 0) {
            System.out.println(values[i] + " is even!");
         }
      }
      for(int value : values) {
        if (value % 2 == 0) {
            System.out.println(value + " is even!");
        }
      }
   }
}