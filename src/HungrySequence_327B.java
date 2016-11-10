import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ask about a proof
// another way to solve it is by getting the prime numbers(not guaranteed to work and i will try it)
public class HungrySequence_327B {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
//		StringBuilder res = new StringBuilder();
//		int product = 1;
//		int j = 2;
//		for (int i = 1; i <= n; i++) {
//			while(product % j == 0)
//				j++;
//			product *= j;
//			res.append(""+j);
//			if(i != n)
//				res.append(" ");
//		}
//		System.out.println(res);
		StringBuilder res = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			int cur = 3*n+i;
			res.append(""+cur);
			if(i != n)
				res.append(" ");
		}
		System.out.println(res);
		
	}

}
