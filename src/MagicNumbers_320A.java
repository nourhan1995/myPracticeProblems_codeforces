import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicNumbers_320A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		boolean flag = true;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '1') {
				while (i < input.length() && input.charAt(i) == '1')
					i++;
				if (i < input.length()) {
					if (input.charAt(i) == '4') {
						if (i + 1 < input.length()) {
							i++;
							if (input.charAt(i) == '4') {
								continue;
							} else {
								if (input.charAt(i) == '1') {
									i--;
								} else {
									flag = false;
									break;
								}
							}
						}
					} else {
						flag = false;
						break;
					}
				}
			}else{
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
