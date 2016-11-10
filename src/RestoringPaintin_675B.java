import java.util.*;
import java.io.*;

public class RestoringPaintin_675B {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int a = new Integer(s.nextToken());
		int b = new Integer(s.nextToken());
		int c = new Integer(s.nextToken());
		int d = new Integer(s.nextToken());
		int v = 0, w = 0, y = 0, x = 0, z = 0;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if((i - c - d) % 2 == 0){
				x = (i - c -d) / 2;
				z = x;
				v = i - a - b - x;
				w = i - a - c - x;
				y = i - d - b - x;
				
			}
		}
		
	}
	
//	public static boolean unique(int i, int j){
//		
//	}

}
