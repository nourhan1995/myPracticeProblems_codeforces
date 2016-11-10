import java.util.*;
import java.io.*;

public class VanyaAndFence_677A {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		int n = new Integer(s1.nextToken());
		int h = new Integer(s1.nextToken());
		StringTokenizer s = new StringTokenizer(br.readLine());
		int width = 0;
		for (int i = 0; i < n; i++) {
			if((new Integer(s.nextToken()) <= h))
				width += 1;
			else
				width += 2;
		}
		System.out.println(width);
		
	}

}
