
public class Peergrade6 {

	public static void main(String[] args){
		int[] array = {0,10};
		hobecheck(array);
	}

	public static Boolean hobecheck (int [] a ){
		int x = 0;
		System.out.println(a[1] + " " + a[a.length-1]);
		if (a [1] < a[a.length -1]) x =1; 
		for (int i = 1; i < a.length /2; i ++){
			System.out.println(a[1] + " " + a[a.length/2]);
			if (x == 0 && (a[i]< a[i*2]|| a[i]<a [i*2+1])) return false ;
			if (x == 1 && (a[i]> a[i*2]|| a[i]>a [i*2+1])) return false ;
		}
		System.out.println("hej");
		return true;
	}
}
