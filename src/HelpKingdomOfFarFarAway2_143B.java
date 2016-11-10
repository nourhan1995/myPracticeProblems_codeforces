import java.io.*;
import java.util.*;

public class HelpKingdomOfFarFarAway2_143B {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		boolean minus = false;
		if (input.charAt(0) == '-')
			minus = true;
		if (minus)
			input = input.substring(1);
		String integer = "";
		String decimal = "00";
		StringTokenizer st = new StringTokenizer(input, ".");
		integer = st.nextToken();
		if (st.hasMoreTokens())
			decimal = st.nextToken();
		StringBuilder res = new StringBuilder();
		if (minus)
			res.append('(');
		res.append('$');
		if (input.charAt(0) != 0) {
			Stack<Character> s = new Stack<>();
			int count = 0;
			for (int i = integer.length() - 1; i >= 0; i--) {
				s.push(integer.charAt(i));
				count++;
				if (count % 3 == 0 && i != 0) {
					s.push(',');
					count = 0;
					// System.out.println(s.size());
				}
				// System.out.println(s.size());
			}
			while (!s.isEmpty())
				res.append(s.pop());
		}else
			res.append(0);
		res.append('.');
		if (decimal.length() > 2)
			res.append(decimal.substring(0, 2));
		else {
			if (decimal.length() < 2)
				res.append(decimal + "0");
			else
				res.append(decimal);
		}
		if (minus)
			res.append(')');
		System.out.println(res.toString());
		// System.out.println(integer);
		// System.out.println(decimal);

	}

}
