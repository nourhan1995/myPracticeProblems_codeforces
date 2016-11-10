import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HQ9Plus_133A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		boolean flag = false;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'H' || input.charAt(i) == 'Q' || input.charAt(i) == '9' /*|| input.charAt(i) == '+'*/){
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

}
