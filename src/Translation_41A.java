import java.util.*;
import java.io.*;

public class Translation_41A {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		if(s1.length() != s2.length())
			System.out.println("NO");
		else{
			boolean flag = true;
			int j = s2.length()-1 ;
			for (int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i) != s2.charAt(j)){
					flag = false;
					break;
				}
				j--;
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
	}

}
