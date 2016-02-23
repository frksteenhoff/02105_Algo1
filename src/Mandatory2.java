/*
 * Henriette Steenhoff, s134869
 * 02105 - Mandatory Assignment 2
 */
public class Mandatory2 {

	public static void main(String[] args){
		int[] A = {0,3,4,5,1};
		int lenA = A.length+1;

		missingNumber(A, lenA);
	}
	public static void missingNumber(int[] A, int lenA){
		boolean[] B = new boolean[lenA];

		//
		for(int i = 0 ; i < lenA-1 ; i++){
			B[A[i]] = true;
		}
		
	}
}
