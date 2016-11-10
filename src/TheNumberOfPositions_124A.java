import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheNumberOfPositions_124A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int a = new Integer(s.nextToken());
		int b = new Integer(s.nextToken());
		System.out.println(n - Math.max(a + 1, n - b) + 1);
		
	}

}
