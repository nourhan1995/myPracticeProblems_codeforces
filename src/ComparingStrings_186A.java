import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class ComparingStrings_186A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s1 = br.readLine().toCharArray();
		char[] s2 = br.readLine().toCharArray();
		if (s1.length != s2.length)
			System.out.println("NO");
		else {
			Hashtable<Character, Integer> has = new Hashtable<>();
			for (int i = 0; i < s1.length; i++) {
				if (!has.containsKey(s1[i]))
					has.put(s1[i], 0);
			}
			boolean flag = true;
			for (int i = 0; i < s2.length; i++) {
				if (!has.containsKey(s2[i])) {
					flag = false;
					break;
				}
			}
			if (!flag)
				System.out.println("NO");
			else {
				ArrayList<Integer> res;
				do {
					res = getSwaps(s1, s2);
					if (res.size() == 2) {
						char tmp = s2[res.get(0)];
						s2[res.get(0)] = s2[res.get(1)];
						s2[res.get(1)] = tmp;
					} else
						break;
				} while (res.size() == 2);
				if (res.size() == 0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}

	public static ArrayList<Integer> getSwaps(char[] s1, char[] s2) {
		ArrayList<Integer> res = new ArrayList<>();
		for (int j2 = 0; j2 < s1.length; j2++) {
			if (s1[j2] != s2[j2]) {
				res.add(j2);
			}
		}
		return res;
	}

}
