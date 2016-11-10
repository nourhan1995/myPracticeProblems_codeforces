import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DimaAndFriends_272A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int c = 0;
		int sum = 0;
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			sum += new Integer(s.nextToken());
		}
		for (int i = 1; i <= 5; i++) {
			if((sum +i) % (n+1) != 1)
				c++;
		}
		System.out.println(c);
		
	}

}
