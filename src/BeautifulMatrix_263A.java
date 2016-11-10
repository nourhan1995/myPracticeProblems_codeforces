import java.util.*;
import java.io.*;

public class BeautifulMatrix_263A {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ix = 3, jx = 3;
		boolean flag = false;
		for (int i = 1; i <= 5; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 5; j++) {
				int cur = new Integer(s.nextToken());
				if(cur == 1){
					ix = i;
					jx = j;
					flag = true;
					break;
				}
			}
			if(flag)
				break;
		}
		System.out.println(Math.abs(ix - 3) + Math.abs(jx - 3));
		
	}

}
