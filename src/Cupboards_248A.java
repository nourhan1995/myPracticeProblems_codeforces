import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cupboards_248A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int lo = 0, lc = 0, ro = 0, rc = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int l = new Integer(s.nextToken());
			int r = new Integer(s.nextToken());
			if(l == 0)
				lc++;
			else
				lo++;
			if(r == 0)
				rc++;
			else
				ro++;
		}
		System.out.println(Math.min(lc, lo) + Math.min(rc, ro));
		
	}

}
