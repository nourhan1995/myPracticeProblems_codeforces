import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JeffAndDigits_352A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		StringTokenizer s = new StringTokenizer(br.readLine());
		int c_5 = 0;
		int c_0 = 0;
		String res_5 = "";
		String res_0 = "";
		for (int i = 0; i < n; i++) {
			String cur = s.nextToken();
			if(cur.charAt(0) == '5'){
				c_5++;
				res_5 += cur;
			}else{
				c_0++;
				res_0 += cur;
			}
		}
		if(c_0 == 0)
			System.out.println(-1);
		else{
			if(c_5 < 9)
				System.out.println(0);
			else{
				int tmp = c_5;
				while(c_5 % 9 != 0)
					c_5--;
				int diff = tmp - c_5;
				System.out.println(res_5.substring(diff) + res_0);
			}
		}
		
	}
	
}
