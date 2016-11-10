import java.io.*;
import java.util.*;

public class UnusualProduct {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int map [][] = new int [n][n];
		int ans = 0;
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < map.length; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = new Integer(s.nextToken());
				if(i == j)
					ans ^= map[i][j];
			}
		}
		int q = new Integer(br.readLine());
		for (int i = 0; i < q; i++) {
			String query = br.readLine();
			if(query.charAt(0) == '1' || query.charAt(0) == '2')
				ans ^= 1;
			else
				res.append(ans+"");
		}
		System.out.println(res.toString());
		
	}

}
