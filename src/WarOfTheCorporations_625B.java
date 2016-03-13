import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// wrong answer on pretest 11
// to be continued
public class WarOfTheCorporations_625B {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String sub = br.readLine();
		int j = 0;
		int t = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == sub.charAt(j)){
				j++;
			}
			if(j == sub.length()){
				j = 0;
				t++;
			}
		}
		System.out.println(t);
		
	}

}
