import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MooresLaw_630B {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken()), t = new Integer(s.nextToken());
		System.out.println(Math.pow(1.000000011, t)*n);
		
	}

}
