package U4T9;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list);
        System.out.println(Fix34.fix34(list));
    }
}
