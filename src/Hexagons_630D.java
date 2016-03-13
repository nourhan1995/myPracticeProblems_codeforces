import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hexagons_630D {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
//		int d = 6, a0 = 6;
//		long z = d*(n-1);
//		long f = 2*a0 + z;
//		long res = (long) n * f;
		System.out.println((long) 3*n*(n+1)+1);

	}
	
}
