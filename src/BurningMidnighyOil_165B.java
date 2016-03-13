import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BurningMidnighyOil_165B {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int k = new Integer(s.nextToken());
//		int [] a = new int[n];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = i+1;
//		}
		int min = 0;
		int lo = 0;
		int hi = n - 1;
//		int tmp = 1/k;
		while(lo <= hi){
			int midIndx = lo + (hi - lo)/2;
			int sum = calcSum(midIndx+1, k);
//			int sum = mid;
//			int value = mid /k;
//			while(value != 0){
//				sum += value;
//				value *= 1/k;
//			}
			if(sum >= n){
				min = midIndx+1;
				hi = midIndx - 1;
			}else
				lo = midIndx + 1;
		}
		System.out.println(min);
		
	}
	
	public static int calcSum(int x, int k){
		int result = 0;
		int i = 1;
		int cur = x;
		while(cur > 0){
			int t = 1;
			result += cur;
			for (int j = 0; j < i; j++) {
				t *= k;
			}
			cur = x / t;
			i++;			
		}
		return result;
	}

}
