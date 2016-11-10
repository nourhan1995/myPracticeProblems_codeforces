import java.util.*;
import java.io.*;

public class NearlyLuckyNumber_110A {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int count = 0;
		for (int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == '4' || line.charAt(i) == '7')
				count++;
		}
		String no = count+"";
		boolean flag = true;
		for (int i = 0; i < no.length(); i++) {
			if(no.charAt(i) != '4' && no.charAt(i) != '7'){
				flag = false;
				break;
			}
		}
		if(!flag)
			System.out.println("NO");
		else
			System.out.println("YES");
		
	}

}
