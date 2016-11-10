import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Reconaissance2_34A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int sol [] = new int[n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < sol.length; i++) {
			sol[i] = new Integer(s.nextToken());
		}
		int min = 2000;
		int sol1 = -1;
		int sol2 = -1;
		for (int i = 0; i < sol.length; i++) {
			int nxt = i + 1;
			if(nxt == n)
				nxt = 0;
			if(Math.abs(sol[i] - sol[nxt]) < min){
				min = Math.abs(sol[i] - sol[nxt]);
				sol1 = i+1;
				sol2 = nxt+1;
			}
//			System.out.println(min);
		}
		System.out.println("" + sol1 + " " + sol2);
		
	}

}
