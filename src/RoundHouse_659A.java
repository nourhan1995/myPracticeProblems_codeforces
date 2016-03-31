import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RoundHouse_659A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int a = new Integer(s.nextToken());
		int b = new Integer(s.nextToken());
//		int result = 0;
		if(b > 0){
			while(b-- > 0){
				a++;
				if(a > n)
					a = 1;
			}
		}else{
			while(b++ < 0){
				a--;
				if(a < 1)
					a = n;
			}
		}
		System.out.println(a);
		
	}

}
