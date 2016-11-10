import java.io.*;
import java.util.*;

public class AddingDigits {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int a = new Integer(s.nextToken());
		int b = new Integer(s.nextToken());
		int n = new Integer(s.nextToken());
		int[] no = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		boolean flag = false;
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			if((a*10+i) %b == 0){
				a *= 10;
				a += i;
				n--;
				res.append(a+"");
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println("-1");
		else{
			while(n-- > 0)
				res.append("0");
			System.out.println(res.toString());
		}
//		if ( b - (a*10)%b >= 10)
//			System.out.println("-1");
//		else {
//			for (int i = 0; i < n; i++) {
//				int tmp = a * 10;
//				for (int j = 0; j < no.length; j++) {
//					if ((tmp + no[j]) % b == 0) {
//						a = tmp + no[j];
//						break;
//					}
//				}
//			}
//			System.out.println(a);
//		}

	}

}