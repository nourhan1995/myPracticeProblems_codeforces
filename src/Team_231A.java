import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Team_231A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int [] problems = new int[n];
		int c = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			while (s.hasMoreElements()) {
				Integer t = new Integer(s.nextToken());
				if(t == 1)
					problems[i]++;
			}
		}
		for (int i = 0; i < problems.length; i++) {
			if(problems[i] >= 2)
				c++;
		}
		System.out.println(c);
	}

}
