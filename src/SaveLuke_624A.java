import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class SaveLuke_624A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int d = new Integer(s.nextToken()), L = new Integer(s.nextToken()), v1 = new Integer(s.nextToken()), v2 = new Integer(s.nextToken());
		System.out.println((double) (L - d)/(v1 + v2));
		
	}

}
