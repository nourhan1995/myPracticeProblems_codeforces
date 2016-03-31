import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Taxi_158B {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		StringTokenizer s = new StringTokenizer(br.readLine());
		int no1 = 0;
		int no2 = 0;
		int no3 = 0;
		int count = 0;
		while(s.hasMoreTokens()){
			int cur = new Integer(s.nextToken());
			switch(cur){
			case 1: no1++;break;
			case 2: no2++;break;
			case 3: no3++;break;
			case 4: count++;break;
			}
		}
		while(no1 != 0 && no3 != 0){
			count++;
			no1--;
			no3--;
		}
		count += no3;
		count += no2 / 2;
		no2 = no2 % 2;
		while(no1 != 0 && no2 != 0){
			count++;
			no2--;
			no1--;
			if(no1 != 0)
				no1--;
		}
		count += no2 % 2;
		count += no1 / 4;
		if(no1 % 4 != 0)
			count++;
		System.out.println(count);			
		
	}

}
