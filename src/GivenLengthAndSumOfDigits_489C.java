import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GivenLengthAndSumOfDigits_489C {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = new Integer(st.nextToken());
		int s = new Integer(st.nextToken());
		int sum = s;
		String minn = "";
		for (int i = 0; i < m; i++) {
			for (int d = 0; d < 10; d++) {
				if ((i > 0 || d > 0 || (m == 1 && d == 0)) && can(m - i - 1, sum - d)) {
					minn += d;
					sum -= d;
					break;
				}
			}
		}
		sum = s;
		String maxx = "";
		for (int i = 0; i < m; i++) {
			for (int d = 9; d >= 0; d--) {
				if ((i > 0 || d > 0 || (m == 1 && d == 0)) && can(m - i - 1, sum - d)) {
					maxx += d;
					sum -= d;
					break;
				}
			}
		}
		// System.out.println(minn);
		// System.out.println(maxx);
		if (minn.length() == 0)
			minn = "-1";
		else {
			if (m > 1 && s == 0)
				minn = "-1";
		}
		if (maxx.length() == 0)
			maxx = "-1";
		else {
			if (m > 1 && s == 0)
				maxx = "-1";
		}
		System.out.println(minn + " " + maxx);

	}

	public static boolean can(int m, int s) {
		return s >= 0 && s <= 9 * m;
	}

}
