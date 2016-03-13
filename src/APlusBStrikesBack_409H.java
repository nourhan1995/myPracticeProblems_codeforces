import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class APlusBStrikesBack_409H {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int a = new Integer(s.nextToken());
		int b = new Integer(s.nextToken());
////		int count = 0;
//		for (int i = 0; i <= a; i++) {
////			for (int j = 1; j <= b; j++) {
////				count += i;
////			}
//			b += i;
//		}
		System.out.println(a+b);
		
	}

}
