import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tram_116A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int max = 0;
		int capSoFar = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			capSoFar -= new Integer(s.nextToken());
			max = Math.max(capSoFar, max);
			capSoFar += new Integer(s.nextToken());
			max = Math.max(capSoFar, max);
		}
		System.out.println(max);
		
	}

}
