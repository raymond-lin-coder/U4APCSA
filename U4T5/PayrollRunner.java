public class PayrollRunner {
    public static void main(String[] args) {
        int[] items = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60};
Payroll payroll = new Payroll(items);
int[] items2 = {1, 2, 3, 4, 5, 6, 7};
Payroll payroll2 = new Payroll(items2);

System.out.println("------ TESTING PART A -------");
System.out.println(payroll.computeBonusThreshold());
System.out.println(payroll2.computeBonusThreshold());

System.out.println("\n------ TESTING PART B -------");
payroll.computeWages(10, 1.5);
double[] wages = payroll.getWages();
for (double wage : wages) {
    double rounded = Math.round(wage * 100) / 100.0;
    System.out.print(rounded + " ");
}
System.out.println();
payroll.computeWages(5, 4);
wages = payroll.getWages();
for (double wage : wages) {
    double rounded = Math.round(wage * 100) / 100.0;
    System.out.print(rounded + " ");
}
System.out.println();
payroll2.computeWages(10, 1.5);
wages = payroll2.getWages();
for (double wage : wages) {
    double rounded = Math.round(wage * 100) / 100.0;
    System.out.print(rounded + " ");
}
System.out.println();
payroll2.computeWages(5, 4);
wages = payroll2.getWages();
for (double wage : wages) {
    double rounded = Math.round(wage * 100) / 100.0;
    System.out.print(rounded + " ");
}
System.out.println();

    }
}
