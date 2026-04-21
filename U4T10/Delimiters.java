import java.util.ArrayList;

public class Delimiters {
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        /* to be implemented in part (a) */
        ArrayList<String> delimiterList = new ArrayList<String>();
        for(String str : tokens) {
            if (str.equals(openDel) || str.equals(closeDel)) {
                delimiterList.add(str);
            }
        }
        return delimiterList;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        /* to be implemented in part (b) */
        int open = 0;
        int closed = 0;
        for(String str : delimiters) {
            if (str.equals(openDel)) {
                open++;
            }
            else if (str.equals(closeDel)) {
                closed++;
            }
            if (closed > open) {
                return false;
            }
        }
        if (open != closed) {
            return false;
        }
        return true;
    }
}