import java.io.*;
import java.util.StringTokenizer;

public class GeorgeAndAccommodation_467A {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int count = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int p = new Integer(s.nextToken());
			int q = new Integer(s.nextToken());
			if(q - p > 1)
				count++;
		}
		System.out.println(count);
		
	}

}
