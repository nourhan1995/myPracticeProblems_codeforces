import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sale_34B {

	static int[] a, memo[];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int m = new Integer(s.nextToken());
		a = new int[n];
		memo = new int[n][m + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			Arrays.fill(memo[i], -1);
			a[i] = new Integer(st.nextToken());
		}
		System.out.println(dp(0, m));

	}

	public static int dp(int index, int rem) {
		if (index == a.length || rem == 0)
			return 0;
		if (memo[index][rem] != -1)
			return memo[index][rem];
		return memo[index][rem] = Math.max(a[index] * -1 + dp(index + 1, rem - 1), dp(index + 1, rem));
	}

}
