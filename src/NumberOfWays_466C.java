import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberOfWays_466C {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int[] a = new int[n];
		long sum = 0;
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = new Integer(s.nextToken());
			sum += a[i];
		}
		if (sum % 3 != 0)
			System.out.println(0);
		else {
			int[] count = new int[n];
			sum /= 3;
			long tmp = 0;
			for (int i = n - 1; i >= 0; i--) {
				tmp += a[i];
				if(tmp == sum)
					count[i]++;
//				System.out.println(Arrays.toString(count));
			}
//			System.out.println(Arrays.toString(count));
			for (int i = n-2; i >= 0; i--) {
				count[i] += count[i+1];
			}
//			System.out.println(Arrays.toString(count));
			tmp = 0;
			long ans = 0;
			for (int i = 0; i < n - 2; i++) {
				tmp += a[i];
				if(tmp == sum)
					ans += count[i+2];
//				System.out.println(ans);
			}
			System.out.println(ans);
		}

	}

}
