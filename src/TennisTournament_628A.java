import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TennisTournament_628A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken()), b = new Integer(s.nextToken()), p = new Integer(s.nextToken());
		int noOfTowels = p*n;
		int noOfBottles = 0;
		while(n > 1){
			int k = 1;
			while(k <= n){
				k = k << 1;
			}
			k = k >> 1;
//			System.out.println(k);
			int m = k /2;
			noOfBottles += b*k + m;
			n = k / 2 + (n - k);
		}
		System.out.println(noOfBottles + " " + noOfTowels);

	}

}
