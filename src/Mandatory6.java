import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Mandatory6 {

	public static void main(String [] args) throws FileNotFoundException {
		//Scanner console = new Scanner(System.in);
		//System.out.println("Please enter file name:");
		//String name = console.nextLine();
		Scanner input = new Scanner(new File("src/matrix.txt"));
		String[][] result = process(input);
		printMatrix(result);
		DFS(result, 5);

	}

	private static void printMatrix(String[][] result) {
		System.out.println("The matrix read for DFS: \n" + result.length + " nodes");
		for(int i = 0; i < result.length ; i++){
			for(int j = 0; j < result.length; j++){
				System.out.print(result[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	private static String[][] process(Scanner input) {
		ArrayList<String> temp = new ArrayList<>();
		int lineCount = 0;
		while(input.hasNextLine()){
			StringBuilder sb = new StringBuilder();
			sb.append("node");
			sb.append(lineCount);
			String name = sb.toString();
			
			
			
			Node String line = input.nextLine();
			temp.add(line);
			lineCount ++;
		}
		String[][] allData = new String[lineCount][];
		for(int i = 0; i < lineCount; i++){
			allData[i] = processLine(lineCount, i, temp);
		}
		return allData;
	}

	private static String[] processLine(int lineCount, int iterator, ArrayList<String> temp) {
		int i = 0;
		String[] incmat = new String[lineCount]; //Preallocation space for array (adjacency list)
		String splitstr = temp.get(iterator);
		String delim = " ";
		StringTokenizer str = new StringTokenizer(splitstr, delim);
		
		while(str.hasMoreElements()){
			String out = (String) str.nextElement();
			incmat[i] = out;
			i ++;
		}
		return incmat;
	}

	public static void DFS(String[][] result, int index){
		
	}
}
