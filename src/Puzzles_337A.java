import java.io.*;
import java.util.*;

public class Puzzles_337A {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int m = new Integer(s.nextToken());
		int a[] = new int [m];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = new Integer(st.nextToken());
		}
		Arrays.sort(a);
		int min = (int ) 1e9;
		for (int i = n-1; i < a.length ;i++) {
//			System.out.println(i);
			int cur = a[i] - a[i-(n-1)];
			min = Math.min(min, cur);
//			System.out.println(min);
//			System.out.println(max);
		}
		System.out.println(min);
		
	}

}
