import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CutRibbon_189A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int count = 0;
		int a = new Integer(s.nextToken());
		int b = new Integer(s.nextToken());
		int c = new Integer(s.nextToken());
		for (int x = 0; x <= n/a; x++) {
			for (int y = 0; y <= n/b; y++) {
				int z = n - (x*a + y*b);
				if(z >= 0 && z % c == 0 && x+y+(z/c) <= n)
					count = Math.max(count, x+y+(z/c));
			}
		}
//		int [] len = new int [3];
//		for (int i = 0; i < len.length; i++) {
//			len[i] = new Integer(s.nextToken());
//		}
//		Arrays.sort(len);
//		int sum = 0;
//		for (int i = 0; i < len.length; i++) {
//			sum += len[i];
//			if(sum <= n)
//				c++;
//		}
		System.out.println(count);
	}

}
