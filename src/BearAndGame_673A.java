import java.util.*;
import java.io.*;

public class BearAndGame_673A {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		boolean flag = false;
		StringTokenizer s = new StringTokenizer(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Integer(s.nextToken());
		}
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				if (a[i] > 15) {
					flag = true;
					System.out.println(15);
					break;
				}
			} else {
				if (a[i - 1] + 15 < a[i]) {
					flag = true;
					System.out.println(a[i - 1] + 15);
					break;
				}
			}
		}
		if (!flag) {
			if (a[a.length - 1] + 15 < 90)
				System.out.println(a[a.length - 1] + 15);
			else
				System.out.println(90);
		}

	}

}
