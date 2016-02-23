/*
 * Henriette Steenhoff, s134869
 * 02105 - Algoritmer og Datastrukturer 1
 * Mandatory 3
 */
public class Mandatory3 {

	public static void main(String[]args){
		
		// The different lists
		// (The values are equally valid, since they are not used in the program)
		int[] B;
		int[] C; 
		int[] D;  		
		
		//Allocation of memory
		B = new int[800];
		C = new int[1600];
		D = new int[3200];
		
		// Run of the program
		System.out.println("Run of ALG3");
		ALG3(B);
		ALG3(C);
		ALG3(D);
	}

	private static void ALG3(int[] b) {
		// Run time variable start 
		final long start = System.currentTimeMillis();
		
		int k = 0;
		for(int i = 1 ; i <= b.length ; i++){
			for(int j = 1 ; j <= b.length ; j++){
				k = j;
				while(k <= b.length){
					k = k * 3;
				}
			}
		}
		// Run time variable end + print
		final long end = System.currentTimeMillis();
		System.out.println("Execution time: " + (end - start) );
	}
}
