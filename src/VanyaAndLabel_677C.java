import java.util.*;
import java.io.*;

public class VanyaAndLabel_677C {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		long ans = 1;
		for (int i = 0; i < input.length(); i++) {
			int cur = getValue(input.charAt(i));
			int count = 6 - Integer.bitCount(cur);
			for (int j = 0; j < count; j++) {
				ans = (ans * 3) % (1000000007);
			}
		}
		System.out.println(ans);
		
	}
	
	public static int getValue(char c){
		if(c == '-')
			return 62;
		else{
			if(c == '_')
				return 63;
			else{
				if(c >= '0' && c <= '9')
					return c - '0';
				else{
					if(c >= 'A' && c <= 'Z')
						return c - 'A' + 10;
					else{
						return c - 'a' + 36;
					}
				}
			}
		}
	}

}
