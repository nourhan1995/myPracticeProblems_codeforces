import java.io.*;
import java.util.*;

public class GameWithSticks_451A {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int m = new Integer(s.nextToken());
//		if (n == 1 || m == 1)
//			System.out.println("Akshat");
//		else {
//			if ((n * m) % 2 == 0)
//				System.out.println("Malvika");
//			else
//				System.out.println("Akshat");
//		}
		if(Math.min(n, m)%2 == 0)
			System.out.println("Malvika");
		else
			System.out.println("Akshat");

	}

}
