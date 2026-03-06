package U4T7;
import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    // create an array with the known values
    public static void main(String [] args) {
        Car car1 = new Car("Lamborghini Aventador", 500);
        Car car2 = new Car("Lamborghini Huracan", 250);
        Car car3 = new Car("Tesla Cybertruck", 2500);
        Car[] carArray = {car1, car2, car3};
// use the Arrays.asList utility method to convert the array to a list "inline"
ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(carArray));
System.out.println(carList);
    }
}
