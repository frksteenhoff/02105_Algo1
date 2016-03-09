
public class Mandatory5 {

	public static void main(String [] args){

		// Will succeed
		int[] heapArray = {0,20,17,18,12,11,9,10,2,3,4,5,8,8};
		int[] heapArray2 = {0,40,30,20,17,19,9,10,2,2,4,5,8,8,1,0,0,1,1,1};
		int[] heapArray3 = {0,3,2,1};

		// Will fail
		int[] heapFail = {0,30,40,10};
		int[] heapFail2 = {0,100,80,99,30,50,60,20,31,1,2};

		boolean ans = isHeap(heapArray);
		System.out.println(ans + "\n");
		boolean ans2 = isHeap(heapArray2);
		System.out.println(ans2);
		boolean ans3 = isHeap(heapArray3);
		System.out.println(ans3);
		boolean ans4 = isHeap(heapFail);
		System.out.println(ans4);
		boolean ans5 = isHeap(heapFail2);
		System.out.println(ans5);
	}

	private static boolean isHeap(int[] heapArray) {
		// checking whether the heap is empty
		if(heapArray == null){
			return false;
		} else{
			// working on the tree from root and down
			return isheapOrdered(heapArray);
		}
	}

	private static boolean isheapOrdered(int[] A) {
		// running half way through the length of the array
		if(A.length < 5){
			if(A.length == 2){
				return true;
			} else if(A.length == 4 && A[1] > A[2] && A[1] > A[3]){
				System.out.println( "\n" + A[1]+ " " + A[2] + " "+ A[3]);
				return true;
			} else {
				return false;
			}
		}
		for(int i = 1; i <= A.length/2; i++){
			System.out.println(A[i]+ " " + A[2*i] + " "+ A[2*i + 1]);
			// checking whether we have reached the leaves of the tree
			if(i >= Math.floor(A.length/2)-1 && A[i] > A[2*i] && A[i] > A[2*i + 1]){
				return true;
				// running through the heap
			}else if(A[i] > A[2*i] && A[i] > A[2*i + 1]){
			}else{
				return false;
			}
		}
		return false;
	}
}