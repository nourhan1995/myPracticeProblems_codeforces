import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class SlimeCombining_WunderFund {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter p = new PrintWriter(new OutputStreamWriter(System.out));
		StringBuilder s = new StringBuilder();
		int n = new Integer(br.readLine());
		int [] a = new int[n];
		Arrays.fill(a, 0);
		int i = 0;
		while(n > 0){
			n--;
			a[i] = 1;
			while(i-1 >= 0 && a[i] == a[i-1]){
				a[i-1]++;
				a[i] = 0;
				i = i-1;
			}
			i++;
		}
//		System.out.println(Arrays.toString(a));
		for (int j = 0; j < a.length; j++) {
			if(a[j] != 0){
				s.append("" + a[j]);
				if(j+1 < a.length && a[j] != 0)
					s.append(" ");
			}else
				break;
				
		}
		p.print(s);
		p.flush();
		p.close();
		
	}

}
