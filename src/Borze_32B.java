import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Borze_32B {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String res = "";
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '.')
				res += '0';
			else{
				i++;
				if(input.charAt(i) == '-')
					res += '2';
				else
					res += '1';
			}
		}
		System.out.println(res);
		
	}

}
