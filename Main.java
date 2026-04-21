public class Main {
    public static void main(String[] args) {
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"}, {"Brian", "Elenor", "Harry", "Lenny"}, {"Cathy", "Fred", "Jill", "Matt"}};
        for(int i = 0; i < seatingChart.length; i++) {
            for(int j = 0; j < seatingChart[i].length; j++) {
                System.out.print(seatingChart[i][j] + " ");
            }
            System.out.println();
        }
        seatingChart[1][2] = "Paul";
        for(int i = 0; i < seatingChart.length; i++) {
            for(int j = 0; j < seatingChart[i].length; j++) {
                System.out.print(seatingChart[i][j] + " ");
            }
            System.out.println();
        }
        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;
        for(int i = 0; i < seatingChart.length; i++) {
            for(int j = 0; j < seatingChart[i].length; j++) {
                System.out.print(seatingChart[i][j] + " ");
            }
            System.out.println();
        }
    }
}