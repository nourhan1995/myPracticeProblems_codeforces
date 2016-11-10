import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class Letter_43B {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		StringTokenizer s2 = new StringTokenizer(br.readLine());
		Hashtable<Character, Integer> has = new Hashtable<>();
		Hashtable<Character, Integer> want = new Hashtable<>();
		while (s1.hasMoreTokens()) {
			String cur = s1.nextToken();
			for (int i = 0; i < cur.length(); i++) {
				if (has.containsKey(cur.charAt(i))) {
					has.put(cur.charAt(i), has.remove(cur.charAt(i)) + 1);
				} else
					has.put(cur.charAt(i), 1);
			}
		}
		while (s2.hasMoreTokens()) {
			String cur = s2.nextToken();
			for (int i = 0; i < cur.length(); i++) {
				if (want.containsKey(cur.charAt(i))) {
					want.put(cur.charAt(i), want.remove(cur.charAt(i)) + 1);
				} else
					want.put(cur.charAt(i), 1);
			}
		}
		Enumeration<Character> keys = want.keys();
		boolean flag = true;
		while (keys.hasMoreElements()) {
			char cur = keys.nextElement();
			if (!has.containsKey(cur) || has.get(cur) < want.get(cur)) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
