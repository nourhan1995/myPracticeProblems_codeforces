import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class MishkaAndTrip_703B {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		int n = new Integer(s1.nextToken());
		int k = new Integer(s1.nextToken());
		StringTokenizer s = new StringTokenizer(br.readLine());
		long [] c = new long [n];
		long sum = 0;
		for (int i = 0; i < c.length; i++) {
			c[i] = new Integer(s.nextToken());
			sum += c[i];
		}
		Hashtable<Integer, Boolean> capitals = new Hashtable<>();
		StringTokenizer s2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < k; i++) {
			capitals.put(new Integer(s2.nextToken()) -1, true) ;
		}
		BigInteger res = new BigInteger("0");
		Enumeration<Integer> keys = capitals.keys();
		while(keys.hasMoreElements()) {
			int cur = keys.nextElement();
			res = res.add(new BigInteger("" +(c[cur] * (sum - c[cur]))));
			sum -= c[cur];
//			System.out.println(res);
		}
		for (int i = 0; i < n; i++) {
			int next = i+1;
			if(next == n)
				next = 0;
			if(!capitals.containsKey(i) && !capitals.containsKey(next))
				res = res.add(new BigInteger("" +(c[i] * c[next])));
		}
		System.out.println(res);
		
	}

}
