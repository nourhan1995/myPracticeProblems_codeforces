import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SoftDrinking_151A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int k = new Integer(s.nextToken());
		int l = new Integer(s.nextToken());
		int c = new Integer(s.nextToken());
		int d = new Integer(s.nextToken());
		int p = new Integer(s.nextToken());
		int nl = new Integer(s.nextToken());
		int np = new Integer(s.nextToken());
		
		int drink_toasts = (k*l) / nl;
		int lime_toasts = c * d;
		int salt_toasts = p / np;
		
		System.out.println(Math.min(drink_toasts, Math.min(lime_toasts, salt_toasts)) / n);
		
	}

}
