import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Books_279B_anotherImplementation {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		int n = new Integer(s1.nextToken());
		int t = new Integer(s1.nextToken());
		int startIndex = 0;
		int sum = 0;
		int count = 0;
		StringTokenizer s = new StringTokenizer(br.readLine());
		int time [] = new int[n];
		for (int i = 0; i < time.length; i++) {
			time[i] = new Integer(s.nextToken());
		}
		for (int i = 0; i < time.length; i++) {
			sum += time[i];
			while(sum > t && startIndex < i)
				sum -= time[startIndex++];
			if(sum <= t)
				count = Math.max(count, i - startIndex + 1);
		}
		System.out.println(count);
		
	}

}
