import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Magnets_344A {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int c = 1;
		StringBuilder s = new StringBuilder();
		s.append(br.readLine());
		for (int i = 0; i < n-1; i++) {
			String input = br.readLine();
			if(s.charAt(s.length()-1) == input.charAt(0)){
				c++;
			}
			s.append(input);

		}
		System.out.println(c);

	}

}
