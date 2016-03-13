import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


// to be corrected

public class MakingAString_624B {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int [] c = new int[n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < c.length; i++) {
			c[i] = new Integer(s.nextToken());
		}
		Arrays.sort(c);
		long sum = c[c.length-1];
		for (int i = c.length - 2; i >= 0; i--) {
			if(c[i] >= c[i+1])
				c[i] = c[i+1] - 1;
			sum += c[i];
//			System.out.println(sum);
		}
		System.out.println(sum);
		
	}

}
