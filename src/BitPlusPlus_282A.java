import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitPlusPlus_282A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int x = 0;
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			if(line.equals("++X") || line.equals("X++"))
				x++;
			else
				x--;
		}
		System.out.println(x);
		
	}

}
