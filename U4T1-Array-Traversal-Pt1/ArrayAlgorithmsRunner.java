public class ArrayAlgorithmsRunner {
    public static void main(String[] args) {
String word = "Computer Science!";

String[] letters = ArrayAlgorithms.stringToArray(word);

for (int i = 0; i < letters.length; i++) {

    System.out.print(letters[i]);

}

System.out.println();

String word2 = "* ** *** **** ***** ******";

String[] letters2 = ArrayAlgorithms.stringToArray(word2);

for (int i = 0; i < letters2.length; i++) {

    System.out.print(letters2[i]);

}
    }
}
