import java.util.*;
import java.io.*;

public class InsomniaCure_148A {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = new Integer(br.readLine());
		int l = new Integer(br.readLine());
		int m = new Integer(br.readLine());
		int n = new Integer(br.readLine());
		int d = new Integer(br.readLine());
		
		// lcm needs to be calculated
		int first = d/k;
		int second = d/l;
		int third = d/m;
		int fourth = d/n;
		int kl = d/lcm(k, l);
		int km = d/lcm(k, m);
		int kn = d/lcm(k, n);
		int lm = d/lcm(l, m);
		int ln = d/lcm(l, n);
		int mn = d/lcm(m, n);
		int klm = d/lcm(k, lcm(l, m));
		int kln = d/lcm(k, lcm(l, n));
		int lmn = d/lcm(l, lcm(n, m));
		int kmn = d/lcm(k, lcm(m, n));
		int klmn = d/lcm(lcm(k, l), lcm(m, n));
		System.out.println(/*1 */+ first + second + third + fourth - kl - km - kn - lm - ln - mn + klm + kln + lmn + kmn - klmn);
		
	}
	
	public static int gcd(int a, int b){
//		while(a != b){
//			if(a < b)
//				b -= a;
//			else
//				a -= b;
//		}
//		return a;
		return b == 0 ? a : gcd(b, a%b);
	}
	
	public static int lcm (int m, int n){
		return m*(n/gcd(m,n));
	}

}
