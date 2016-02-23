
public class Mandatory3 {

	public static void main(String[]args){
		
		int[] B = {12,4,23,11,-2,3,4,1,1};
		System.out.println("Run of ALG3");
		ALG3(B);
	}

	private static void ALG3(int[] b) {
		int k = 0;
		for(int i = 0 ; i < b.length ; i++){
			for(int j = 0 ; j < b.length ; j++){
				k = j;
				while(k <= b.length){
					k = k * 3;
				}
			}
		}
		System.out.println("Ended, " + k);
	}
}
