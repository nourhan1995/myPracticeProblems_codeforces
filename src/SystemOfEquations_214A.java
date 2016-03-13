import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class SystemOfEquations_214A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int m = new Integer(s.nextToken());
		int c = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if((i*i+j) == n && (i+j*j) == m)
					c++;
			}
		}
		System.out.println(c);
		
	}

}
