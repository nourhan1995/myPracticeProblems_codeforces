import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Presents_136A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int [] p = new int [n+1];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			p[new Integer(s.nextToken())] = i+1;
		}
		for (int i = 1; i < p.length; i++) {
			System.out.print(p[i] + " ");
		}
		
	}

}
