import java.io.*;
import java.util.*;

public class Expression_479A {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer s = new StringTokenizer(br.readLine());
		int a = new Integer(br.readLine());
		int b = new Integer(br.readLine());
		int c = new Integer(br.readLine());
		int max = 0;
		max = Math.max(max, (a+b)*c);
		max = Math.max(max, a*(b+c));
		max = Math.max(max, a*b*c);
		max = Math.max(max, a+b+c);
		max = Math.max(max, a+b*c);
		max = Math.max(max, a*b+c);
		System.out.println(max);
		
	}

}
