public class Sound {

   /* the array of values in this sound; guaranteed not to be null */
   private int[] samples;
 
   /* constructor not shown */

   /* Changes those values in this sound that have an amplitude
    * greater than limit. Values greater than limit are changed to
    * limit. Values less than -limit are changed to -limit.
    * The method returns the total number of values that were changed
    * in the array.
    *
    * PRECONDITION: limit ≥ 0
    */
   public Sound(int[] samples) {
    this.samples = samples;
}


public int[] getSamples() {
    return samples;
}

    public int limitAmplitude(int limit) {
        /* To be implemented in part (a) */
        int numChanges = 0;
	for(int i = 0; i < samples.length; i++) {
		if (samples[i] < (limit * -1)) {
			samples[i] = (limit * -1);
	numChanges++;
}
if (samples[i] > limit) {
	samples[i] = limit;
	numChanges++;
}
}
return numChanges;

    }
 
   /* Removes all silence from the beginning of this sound.
    * Silence is represented by a value of 0.
    *
    * PRECONDITION: samples contains at least one nonzero value
    *
    * POSTCONDITION: the length of samples reflects the removal
    *                of starting silence
    */
    public void trimSilenceFromBeginning() {
        /* To be implemented in part (b) */
        int howManyZerosAtFront = 0;
	for(int i = 0; i < samples.length; i++) {
	if (samples[i] != 0) {
	break;
}
howManyZerosAtFront++;
}
int[] newSamples = new int[samples.length - howManyZerosAtFront];
for(int i = 0; i < newSamples.length; i++) {
	newSamples[i] = samples[i + howManyZerosAtFront];
}
samples = newSamples;

    }
}
