package U4T3;

public class PersonRunner {
    public static void main(String[] args) {
        Person p1 = new Person("Adam", 12);
        Person p2 = new Person("Barb", 15);
        Person p3 = new Person("Cathy", 14);
        Person p4 = new Person("Fred", 16);
        Person[] personArray = {p1, p2, p3, p4};
        for(Person person : personArray) {
            person.setName(person.getName().toUpperCase());
            person.introduce();
        }
    }
}
