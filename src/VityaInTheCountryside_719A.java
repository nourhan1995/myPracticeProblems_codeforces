import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VityaInTheCountryside_719A {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		StringTokenizer s = new StringTokenizer(br.readLine());
		if (n == 1) {
			int cur = new Integer(s.nextToken());
			if (cur == 0)
				System.out.println("UP");
			else {
				if (cur == 15)
					System.out.println("DOWN");
				else
					System.out.println(-1);
			}
		} else {
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = new Integer(s.nextToken());
			}
			if (a[a.length - 1] > a[a.length - 2]) {
				if (a[a.length - 1] != 15)
					System.out.println("UP");
				else
					System.out.println("DOWN");
			} else {
				if (a[a.length - 1] != 0)
					System.out.println("DOWN");
				else
					System.out.println("UP");
			}
		}

	}

}
