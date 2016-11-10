import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectPermutation_233A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		if(n%2 == 1)
			System.out.println(-1);
		else{
			String res = "";
			int j = 1;
			for (int i = 0; i < n/2; i++) {
				res += (j+1) + " " + j + " ";
				j += 2;
			}
			System.out.println(res);
			
		}
		
	}

}
