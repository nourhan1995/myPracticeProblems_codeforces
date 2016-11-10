import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StonesOnTheTable_266A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		String input = br.readLine();
		int count = 0;
		for (int i = 1; i < input.length(); i++) {
			if(input.charAt(i) == input.charAt(i-1))
				count++;
		}
		System.out.println(count);
		
	}

}
