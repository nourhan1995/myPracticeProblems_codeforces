import java.io.*;
import java.util.*;

public class DiceTower {
	
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int top = new Integer(br.readLine());
		int left = 0;
		int right = 0;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			left = new Integer(s.nextToken());
			right = new Integer(s.nextToken());
			if(top == left || top == right || left == right || top == (7-left) || top == (7-right)){
				flag = false;
				break;
			}else{
				top = 7 - top;
			}
		}
		if(flag)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

}
