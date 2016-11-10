import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UltraFastMathematician_61A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		String input2 = br.readLine();
		String res = "";
		for (int i = 0; i < input1.length(); i++) {
			if((input1.charAt(i) == '0' && input2.charAt(i) == '0') || (input1.charAt(i) == '1' && input2.charAt(i) == '1'))
				res += '0';
			else
				res += '1';
		}
		System.out.println(res);
		
	}

}
