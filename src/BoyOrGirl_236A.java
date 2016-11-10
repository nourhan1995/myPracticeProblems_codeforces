import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoyOrGirl_236A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		boolean [] letters = new boolean [26];
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			letters[c-'a'] = true;
		}
		int count = 0;
		for (int i = 0; i < letters.length; i++) {
			if(letters[i])
				count++;
		}
		if(count%2 == 0)
			System.out.println("CHAT WITH HER!");
		else
			System.out.println("IGNORE HIM!");
	}

}
