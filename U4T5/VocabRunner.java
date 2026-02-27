public class VocabRunner {
    public static void main(String[] args) {
        String[] theVocab = {"time", "food", "dogs", "cats", "health", "plants", "sports"};
Vocab vocab = new Vocab(theVocab);

String[] wordArray = {"dogs", "toys", "sun", "plants", "time"};
String[] wordArray2 = {"a", "b", "c", "d", "e", "f"};
String[] wordArray3 = {"sports", "time"};

System.out.println("------ TESTING PART A -------");
System.out.println(vocab.countNotInVocab(wordArray));
System.out.println(vocab.countNotInVocab(wordArray2));
System.out.println(vocab.countNotInVocab(wordArray3));
String[] theVocabList = vocab.getTheVocab();
for (String str : theVocabList) {
    System.out.print(str + " ");
}
System.out.println();
System.out.println("\n------ TESTING PART B -------");
String[] notInVocab = vocab.notInVocab(wordArray);
for (String str : notInVocab) {
    System.out.print(str + " ");
}
System.out.println();
notInVocab = vocab.notInVocab(wordArray2);
for (String str : notInVocab) {
    System.out.print(str + " ");
}
System.out.println();
notInVocab = vocab.notInVocab(wordArray3);
for (String str : notInVocab) {
    System.out.print(str + " ");
}
System.out.println();
theVocabList = vocab.getTheVocab();
for (String str : theVocabList) {
    System.out.print(str + " ");
}
System.out.println();

    }
}
