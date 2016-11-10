import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Juice_709A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		int n = new Integer(s1.nextToken());
		int b = new Integer(s1.nextToken());
		int d = new Integer(s1.nextToken());
		StringTokenizer s = new StringTokenizer(br.readLine());
		int sum = 0;
		int c = 0;
		for (int i = 0; i < n; i++) {
			int cur = new Integer(s.nextToken());
			if(cur <= b){
				if(sum > d){
					c++;
					sum = cur;
				}else
					sum += cur;
			}
		}
		if(sum > d)
			c++;
		System.out.println(c);
		
	}

}
