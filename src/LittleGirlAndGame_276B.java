import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleGirlAndGame_276B {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int [] c = new int [26];
		for (int i = 0; i < input.length(); i++) {
			c[input.charAt(i)-'a']++;
		}
		int odd = 0;
		for (int i = 0; i < c.length; i++) {
			if(c[i]%2 != 0)
				odd++;
		}
		if(odd%2 == 0 && odd != 0)
			System.out.println("Second");
		else
			System.out.println("First");
		
	}

}
