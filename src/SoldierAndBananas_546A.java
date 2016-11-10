import java.util.*;
import java.io.*;

public class SoldierAndBananas_546A {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int k = new Integer(s.nextToken());
		int n = new Integer(s.nextToken());
		int w = new Integer(s.nextToken());
		int count = 0;
		for (int i = 1; i <= w; i++) {
			if(n <= 0)
				count += i*k;
			else{
				if(n - i*k >= 0){
					n -= i*k;
				}else{
					count += -1*(n - i*k);
					n -= i*k;
				}
			}
		}
		System.out.println(count);
		
	}

}
