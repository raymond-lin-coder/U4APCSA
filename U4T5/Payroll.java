public class Payroll {
  private int[] itemsSold; // number of items sold by each employee
  private double[] wages; // wages to be computed in part (b)
  
  /* Creates a Payroll object
   
     PRECONDITIONS: items != null, items.length >= 3
   */
  public Payroll(int[] items) {
    itemsSold = items;
    wages = new double[items.length];
  }
   public double[] getWages() {
    return wages;
}
  /*  Returns the bonus threshold as described in part (a).
   */


  public double computeBonusThreshold() {
    /* To be implemented in part (a) */
    int totalItems = 0;
	for(int i = 0; i < itemsSold.length; i++) {
	totalItems += itemsSold[i];
}
int minItems = itemsSold[0];
int maxItems = itemsSold[0];
for(int i = 0; i < itemsSold.length; i++) {
	if (itemsSold[i] < minItems) {
	minItems = itemsSold[i];
}
}
for(int i = 0; i < itemsSold.length; i++) {
	if (itemsSold[i] > maxItems) {
	maxItems = itemsSold[i];
}
}
totalItems -= minItems;
totalItems -= maxItems;
double bonusThreshold = (totalItems * 1.0) / (itemsSold.length - 2);
return bonusThreshold;

  }
 
  /* Computes employee wages as described in part (b) and stores
     them in wages. The parameter fixedWage represents the fixed
     amount each employee is paid per day. The parameter
     perItemWage represents the amount each employee is paid per
     item sold.
   */
  public void computeWages(double fixedWage, double perItemWage) {
    /* To be implemented in part (b) */
	double bonusThreshold = computeBonusThreshold();
	double baseWage;
	for(int i = 0; i < itemsSold.length; i++) {
	baseWage = fixedWage + (perItemWage * itemsSold[i]);
	double finalWage = baseWage;
	if (itemsSold[i] > bonusThreshold) {
	finalWage *= 1.1;
}
wages[i] = finalWage;
}

  }
}
