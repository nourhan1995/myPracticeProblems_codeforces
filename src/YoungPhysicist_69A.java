import java.io.*;
import java.util.*;

public class YoungPhysicist_69A {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int[] a = new int[3];
		while (n-- > 0) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			for (int i = 0; i < 3; i++) {
				a[i] += new Integer(s.nextToken());
			}
		}
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			if(a[i] != 0){
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
