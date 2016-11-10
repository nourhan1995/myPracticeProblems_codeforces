import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MaximumSubSequenceProduct_787 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			BigInteger max = new BigInteger("-999999");
			ArrayList<Integer> a = new ArrayList<>();
			while (s.hasMoreTokens()) {
				int cur = new Integer(s.nextToken());
				if (cur != -999999) {
					a.add(cur);
				}
			}
			for (int i = 0; i < a.size(); i++) {
				BigInteger tmp = new BigInteger("1");
//				if(a.get(i) == 0)
//					continue;
				for (int j = i; j < a.size(); j++) {
					tmp = tmp.multiply(new BigInteger("" + a.get(j)));
					if (max.compareTo(tmp) < 0)
						max = tmp;
				}
			}
			System.out.println(max.toString());
			if (!br.ready())
				break;
		}

	}

}
