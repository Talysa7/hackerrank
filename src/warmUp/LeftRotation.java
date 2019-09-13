package warmUp;

import java.util.Arrays;

public class LeftRotation {
	static int[] rotLeft(int[] a, int d) {
		int[] answer = new int[a.length];
		
		int[] arrayA = Arrays.copyOfRange(a, 0, d);
		int aLen = arrayA.length;
		int[] arrayB = Arrays.copyOfRange(a, d, a.length);
		int bLen = arrayB.length;
		
		System.out.println(Arrays.toString(arrayA) + ", length : " + aLen);
		System.out.println(Arrays.toString(arrayB) + ", length : " + bLen);
		
		System.arraycopy(arrayB, 0, answer, 0, bLen);
		System.arraycopy(arrayA, 0, answer, bLen, aLen);
		
		return answer;
    }
}
