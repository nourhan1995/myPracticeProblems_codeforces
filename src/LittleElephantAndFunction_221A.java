import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleElephantAndFunction_221A {

	static int[] a;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
//		a = new int[n];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = n--;
//		}
//		for (int i = 1; i < n; i++) {
//			f(i);
//		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
		System.out.print(n + " ");
		for (int i = 1; i < n; i++) {
			System.out.print(i + " ");
		}

	}

	public static boolean isSorted() {
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1])
				return false;
		}
		return true;
	}

	public static void NextPermutation() {
		int pre = -1;
		for (int i = 0; i < a.length; i++) {
			int tmp = 0;
			if (i != 0) {
				tmp = a[i];
				a[i] = pre;
				pre = tmp;
			}else{
				tmp = a[i];
				a[i] = a[a.length -1];
				pre = tmp;
			}
		}
	}

	public static void f(int x) {
		if (x == 1)
			return;
		f(x - 1);
		int tmp = a[x - 1];
		a[x - 1] = a[x - 2];
		a[x - 2] = tmp;
	}

}
