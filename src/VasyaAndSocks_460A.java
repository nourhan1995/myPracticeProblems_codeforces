import java.io.*;
import java.util.*;

public class VasyaAndSocks_460A {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int m = new Integer(s.nextToken());
		System.out.println(n + (int) Math.floor((n-1) / (m-1)));
		
	}

}
