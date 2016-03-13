import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;


public class WetSharkAndOddAndEven_341A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		long sum = 0;
//		int odd = 0;
		ArrayList<Integer> odds = new ArrayList<>();
		StringTokenizer s = new StringTokenizer(br.readLine());
		while(s.hasMoreTokens()) {
			int cur = new Integer(s.nextToken());
			sum += cur;
			if(cur % 2 != 0)
				odds.add(cur);				
		}
		Collections.sort(odds);
		if(sum % 2 != 0)
			sum -= odds.get(0);
		System.out.println(sum);
//		for (int i = odds.length - 1; i >= 0; i--) {
//			if(odds[i] % 2 == 0)
//				sum += odds[i];
//			else
//				if(odd == 0)
//					odd = odds[i];
//				else{
//					sum += odds[i] + odd;
//					odd = 0;
//				}
//		}
//		while(s.hasMoreTokens()){
//			int cur = new Integer(s.nextToken());
//			if(cur % 2 == 0)
//				sum += cur;
//			else{
//				if(odd == 0)
//					odd = cur;
//				else{
//					sum += (cur + odd);
//					odd = 0;
//				}
//			}
//		}
		
	}

}
