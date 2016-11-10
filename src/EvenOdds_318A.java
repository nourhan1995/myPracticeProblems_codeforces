import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EvenOdds_318A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		long n = new Long(s.nextToken());
		long k = new Long(s.nextToken());
		long len_odd = n/2;
		if(n % 2 == 1){
			len_odd++;
		}
		if(k > len_odd){
			k -= len_odd;
			System.out.println(2+(k-1)*2);
		}else
			System.out.println(1+(k-1)*2);
		
	}

}
