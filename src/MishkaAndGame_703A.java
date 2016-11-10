import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MishkaAndGame_703A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int m = 0;
		int c = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int mishka = new Integer(s.nextToken());
			int chris = new Integer(s.nextToken());
			if(mishka > chris)
				m++;
			else{
				if(mishka < chris)
					c++;
			}
		}
		if(m > c)
			System.out.println("Mishka");
		else{
			if(m < c)
				System.out.println("Chris");
			else
				System.out.println("Friendship is magic!^^");
		}
		
	}

}
