import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Drinks_200B {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int [] drinks = new int[n];
		double res = 0;
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			res += (double) (new Integer(s.nextToken())) / 100;
		}
		System.out.println((double) (res * 100)/n);
		
	}

}
