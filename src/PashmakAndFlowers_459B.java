import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PashmakAndFlowers_459B {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int[] a = new int[n];
		int min = (int) 1e9;
		int max = 0;
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = new Integer(s.nextToken());
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}
		long count1 = 0;
		long count2 = 0;
		long res = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == min){
				count1++;
//				System.out.println("min: " + count1);
			}
			if (a[i] == max){
				count2++;
//				System.out.println("max: " + count2);
			}
		}
		if (min == max)
			res = (long) ((long) n * (n - 1)) / 2;
		else
			res = count1 * count2;
		System.out.println((max - min) + " " + res);

	}

}
