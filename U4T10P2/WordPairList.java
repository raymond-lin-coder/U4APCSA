import java.util.ArrayList;
public class WordPairList {
    private ArrayList<WordPair> allPairs;
    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
        for(int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                WordPair newWord = new WordPair(words[i], words[j]);
                allPairs.add(newWord);
            }
        }
    }
    public int numMatches() {
        int count = 0;
        for(WordPair pair : allPairs) {
            if (pair.getFirst().equals(pair.getSecond())) {
                count++;
            }
        }
        return count;
    }
}
