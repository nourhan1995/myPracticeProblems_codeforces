import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Team_401C {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		StringBuilder res = new StringBuilder();
		int n = new Integer(s.nextToken());
		int m = new Integer(s.nextToken());
		long[] a = new long[3000001];
		long t = 0, k = 0;
		if (n - 1 <= m && m <= 2 * (n + 1)) {

			if (m == n - 1) {
				a[0] = -1;
				a[m + 1] = -1;
				t = n - 1;
			} else {
				if (m == n) {
					a[m + n] = -1;
					t = n;
				} else
					t = n + 1;
			}

			k = m % t;
//			System.out.println(k);
			// System.out.println(Arrays.toString(a));
			if (k == 0 && m != t)
				k = n + 1;
			if (a[0] == -1)
				res.append("0");
			for (int i = 1; i <= n; i++) {
				if (a[i] != -1) {
					if (k > 0)
						res.append("110");
					else
						res.append("10");
					k--;
				}
			}
			if (a[m + 1] != -1) {
				if (k > 0)
					res.append("11");
				else
					res.append("1");
			}

		} else
			res.append("-1");
		System.out.println(res);

	}

}
