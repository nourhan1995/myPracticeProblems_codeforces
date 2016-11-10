import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word_59A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int upper = 0;
		int lower = 0;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
				lower++;
			else
				upper++;
		}
		if(upper > lower)
			System.out.println(input.toUpperCase());
		else
			System.out.println(input.toLowerCase());
				
	}
	

}
