import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class XeniaAndRingroad_197B {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		// BigInteger n = new BigInteger(s1.nextToken());
		// int m = new Integer(s1.nextToken());
		// StringTokenizer s = new StringTokenizer(br.readLine());
		// BigInteger pre = new BigInteger("1");
		// BigInteger count = new BigInteger("0");
		// while(s.hasMoreTokens()){
		// BigInteger cur = new BigInteger(s.nextToken());
		// if(pre.compareTo(cur) == -1 || pre.compareTo(cur) == 0)
		// count = count.add(cur.subtract(pre));
		// else
		// count = count.add(n.subtract(pre.add(cur)));
		// pre = cur;
		// }
		// System.out.println(count);

		long n = new Long(s1.nextToken());
		int m = new Integer(s1.nextToken());
		long[] a = new long[m];
		StringTokenizer s = new StringTokenizer(br.readLine());
		long res = 0;
		for (int i = 0; i < m; i++) {
			long cur = new Long(s.nextToken());
			a[i] = cur;
			if (i == 0)
				res += cur - 1;
			else {
				if (cur >= a[i - 1])
					res += cur - a[i - 1];
				else
					res += (n - a[i-1]) + cur ;
			}
//			System.out.println(res);
		}
//		System.out.println(Arrays.toString(a));
		System.out.println(res);

	}

}
