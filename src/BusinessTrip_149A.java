import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BusinessTrip_149A {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = new Integer(br.readLine());
		int[] a = new int[12];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = new Integer(s.nextToken());
		}
		Arrays.sort(a);
		int c = 0;
		int sum = 0;
		for (int i = a.length - 1 ; i >= 0 && sum < k; i--) {
			sum += a[i];
			c++;
		}
		if (sum < k)
			System.out.println(-1);
		else
			System.out.println(c);

	}

}
