import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PanoramixsPrediction_80A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int m = new Integer(s.nextToken());
		boolean result = false;
		for (int i = n+1; i <= m ; i++) {
			boolean flag = false;
			for (int j = 2; j <= (int)Math.sqrt(i); j++) {
				if(i%j == 0){
					flag = true;
					break;
				}
			}
			if(!flag){
				if(i == m)
					System.out.println("YES");
				else
					System.out.println("NO");
				result = true;
				break;
			}
		}
		if(!result)
			System.out.println("NO");
		
	}

}
