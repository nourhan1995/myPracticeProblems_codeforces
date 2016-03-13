import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EbonyAndIvory_633A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int a = new Integer(s.nextToken());
		int b = new Integer(s.nextToken());
		int c = new Integer(s.nextToken());
		boolean flag = false;
		for (int i = 0; i <= c/a; i++) {
			for (int j = 0; j <= c/b; j++) {
				if(i*a+j*b == c){
					flag = true;
					System.out.println("Yes");
					break;
				}
			}
			if(flag)
				break;
		}
		if(!flag)
			System.out.println("No");
		
	}

}
