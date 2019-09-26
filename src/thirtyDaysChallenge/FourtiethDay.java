package thirtyDaysChallenge;

import java.util.Arrays;

public class FourtiethDay {
	private int[] elements;
  	public int maximumDifference;
  	
  	FourtiethDay(int[] a) {
  		this.elements = a;
  	}
	
  	void computeDifference() {
  		Arrays.sort(elements);
  		maximumDifference = elements[elements.length-1] - elements[0];
  	}
}
