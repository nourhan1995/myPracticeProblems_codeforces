import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// tutorial to be checked
public class AnatolyAndCockroaches_719B {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(bread.readLine());
		int min = n / 2, r = 0, b = 0;
		String input = bread.readLine();
		for (int i = 0; i < n; i++) {
			if (input.charAt(i) == 'r')
				r++;
			else
				b++;
		}
		if (r == 0 || b == 0) {
			System.out.println("first if condition");
			System.out.println(min);
		} else {
			int rb = 0;
			int br = 0;
			for (int i = 0; i < n; i += 2) {
				if (i + 1 < n) {
					if (input.charAt(i) == 'r' && input.charAt(i + 1) == 'b')
						rb++;
					else {
						if (input.charAt(i) == 'b' && input.charAt(i + 1) == 'r')
							br++;
					}
				}
			}
			System.out.println("rb: " + rb + ", br: " + br);
			if ((rb == min && br == 0) || (rb == 0 && br == min))
				System.out.println(0);
			else
				System.out.println(Math.min(rb, br));
		}

	}

}
