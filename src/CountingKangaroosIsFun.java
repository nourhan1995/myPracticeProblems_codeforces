import java.io.*;
import java.util.*;

public class CountingKangaroosIsFun {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int a [] = new int[n];	
		for (int i = 0; i < n; i++) {
			a[i] = new Integer(br.readLine());
		}
		Arrays.sort(a);
		int ans = 0;
		for (int i = 0, j = n/2; i < n/2 && j < a.length; i++) {
			while(j < a.length && a[j] < 2*a[i]){
				j++;
			}
			if(j < a.length){
				ans++;
				j++;
			}else
				break;
		}
		System.out.println(n - ans);
		
	}

}
