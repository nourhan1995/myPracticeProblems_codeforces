import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;


public class Pangram_520A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		char c = 'a';
		boolean [] characters = new boolean[26];
		Arrays.fill(characters, false);
//		for (int i = 0; i < characters.length; i++) {
//			characters[i] = c++;
//		}
		String s = br.readLine().toLowerCase();
		if(n >= 26){
			for (int i = 0; i < s.length(); i++) {
				characters[s.charAt(i) - 'a'] = true;
			}
			boolean flag = true;
			for (int i = 0; i < characters.length; i++) {
				if(characters[i] == false){
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}else
			System.out.println("NO");
		
	}
	
}
