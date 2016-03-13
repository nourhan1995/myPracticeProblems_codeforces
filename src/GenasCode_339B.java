import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class GenasCode_339B {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int ones = 0;
		int zeros = 0;
		int other = 0;
		boolean flag = false;
		StringBuilder nonbeautiful = new StringBuilder();
		StringBuilder beautiful = new StringBuilder();
		StringTokenizer s = new StringTokenizer(br.readLine());
		while(s.hasMoreTokens()){
			String input = s.nextToken();
			if(input.equals("0")){
				System.out.println("0");
				flag = true;
				break;
			}else{
				if(input.equals("1"))
					continue;
				else{
					ones = 0;
					zeros = 0;
					other = 0;
					for (int i = 0; i < input.length(); i++) {
						if(input.charAt(i) == '1')
							ones++;
						else{
							if(input.charAt(i) == '0')
								zeros++;
							else
								other++;
						}
					}
					if(other != 0)
						nonbeautiful.append(input);
					else{
						if(ones > 1)
							nonbeautiful.append(input);
						else 
							for (int i = 0; i < zeros; i++) {
								beautiful.append('0');
							}
					}
				}
			}
		}
		if(!flag)
			if(nonbeautiful.length() == 0)
				System.out.println("1" + beautiful);
			else
				System.out.println(nonbeautiful.append(beautiful));
	}

}
