package U4T4P3;

public class Mirror{
    public Mirror(){}
    public static String mirrorEnds(String str) {
    //implements here
        String mirroredString = "";
        for(int i = 0; i < str.length(); i++) {
            String beginning = str.substring(0, i + 1);
            String end = str.substring(str.length() - 1 - i);
            String endReversed = "";
            for(int a = end.length() - 1; a >= 0; a--){
                endReversed += end.substring(a, a + 1);
            }
            if (beginning.equals(endReversed)) {
                mirroredString = beginning;
            }
        }
        return mirroredString;
    }
}