/*
 * Henriette Steenhoff, s134869
 * 02105 - Mandatory Assignment 2
 */

public class Mandatory1 {

	public static void main(String[]args){
		int[] A = {1,-2,3,4};
		int[] B = {12,4,23,11,-2,3,4,1,1};
		int[] C = {1,2,1,1,1,11,8};
		int n = A.length;
		int m = B.length;
		int l = C.length;
		System.out.println("Run of A");
		/* 6 sums equal to 0 */
		tabelSjov(A, n);	
		/* 18 sums equal to 0 */
		System.out.println("Run of B");
		tabelSjov(B, m);	
		/* No sums equal to 0 */
		System.out.println("Run of C");
		tabelSjov(C, l);	

	}

	private static void tabelSjov(int[] A, int n) {
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < n ; j++){
				for(int k = 0; k < n ; k++){
					if((A[i] + A[j] + A[k]) == 0){
						System.out.println("true");
					}
				}
			}
		}
	}
}
