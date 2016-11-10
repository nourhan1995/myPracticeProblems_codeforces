import java.io.*;
import java.util.*;

public class XORAndOR {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		if((s1.length() != s2.length()) || (!s1.contains("1") && s2.contains("1")) || (!s2.contains("1") && s1.contains("1")))
			System.out.println("NO");
		else{
//			int a = new Integer(s1);
//			int b = new Integer(s2);
//			if( (a == 0 && b != 0) || (a != 0 && b == 0))
//				System.out.println("NO");
//			else
				System.out.println("YES");
//			if((a ^ b) != a && (a^b) != b)
//				System.out.println("YES");
//			else
//				System.out.println("NO");
//			boolean flag = true;
//			for (int i = 0; i < s1.length(); i++) {
//				int a = new Integer(""+s1.charAt(i));
//				int b = new Integer(""+s1.charAt(i));
//				if((a&b) == (a^b)){
//					flag = false;
//					break;
//				}
//			}
//			if(flag)
//				System.out.println("YES");
//			else
//				System.out.println("NO");
		}
		
	}

}
