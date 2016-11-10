import java.io.*;
import java.util.*;

public class Numbers {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = new Integer(br.readLine());
		int ans = 0;
		for (int i = 2; i <= A-1; i++) {
			int tmp = A;
			int sum = 0;
			while(tmp > 0){
				sum += tmp % i;
				tmp /= i;
			}
			ans += sum;
//			System.out.println(i + " " + sum);
			
		}
		int v = A-2;
		int gcd = gcd(ans, v);
		System.out.println((ans/gcd)+"/" +(v/gcd));
		
	}
	
	public static int gcd(int x, int y){
		if(x == y)
			return x;
		if(x > y)
			return gcd(x-y, y);
		else
			return gcd(x, y-x);
	}

}
