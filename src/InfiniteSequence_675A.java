import java.util.*;
import java.io.*;

public class InfiniteSequence_675A {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		long a = new Long(s.nextToken());
		long b = new Long(s.nextToken());
		long c = new Long(s.nextToken());
		if(a == b)
			System.out.println("YES");
		else{
			if(c >= 0){
				if(b >= a && c != 0 && (b-a) % c == 0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}else{
				if(b <= a && c != 0 && (b-a) % c == 0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
//		while(a < b){
//			a += c;
//		}
//		if (b == a)
//			System.out.println("YES");
//		else
//			System.out.println("NO");
//		if(c >= 0){
//			while(a < b){
//				a += c;
//			}
//			if(b == a)
//				System.out.println("YES");
//			else
//				System.out.println("NO");
//		}else{
//			while(a > b){
//				a += c;
//			}
//			if(b == a)
//				System.out.println("YES");
//			else
//				System.out.println("NO");
//		}
		
	}

}
