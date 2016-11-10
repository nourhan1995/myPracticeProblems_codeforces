import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dubstep_208A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		// StringBuilder res = new StringBuilder();
		// String tmp = "";
		// for (int i = 0; i < input.length(); i++) {
		// if(input.charAt(i) == 'W')
		// }
		String[] splitted = input.split("WUB");
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < splitted.length; i++) {
			if (i != 0 && splitted[i-1].length() != 0)
				res.append(" ");
			if (splitted[i].length() != 0)
				res.append(splitted[i]);
		}
		System.out.println(res);

	}

}
