import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.StringTokenizer;

// to be corrected
public class I_love_Username_155A {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int a[] = new int[n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = new Integer(s.nextToken());
		}
		int count = 0;
		int duplicate = 0;
		int min = a[0];
		int max = a[0];
		Hashtable<Integer, Boolean> found = new Hashtable<>();
		for (int i = 1; i < a.length; i++) {
//			System.out.println(max);
//			System.out.println(min);
			found.put(a[i - 1], true);
			if (a[i] > max || a[i] < min){
				count++;
				if (found.containsKey(a[i]))
					duplicate++;
			}
			if (a[i] < min)
				min = a[i];
			if (a[i] > max)
				max = a[i];
//			System.out.println(count);
//			System.out.println(found.toString());
		}
//		System.out.println(duplicate);
//		System.out.println(count);
		System.out.println(count - duplicate);

	}

}
