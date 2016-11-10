import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PresentFromLena_118B{
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		PrintWriter p = new PrintWriter("output.out");
		int n = new Integer(br.readLine());
//		System.out.println(n);
		StringBuilder res = new StringBuilder();
		int tmp = n*2;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < tmp; j++) {
//				System.out.print(" ");
				res.append(" ");
			}
			for (int j = 0; j <= i; j++) {
//				System.out.print("" + j + " ");
				res.append("" + j );
				if(i != 0)
					res.append(" ");
			}
			for (int j = i -1; j >= 0; j--) {
//				System.out.print("" + j + " ");
				res.append("" + j );
				if(j != 0)
					res.append(" ");
			}
			tmp -= 2;
//			System.out.println();
			res.append("\n");
		}
		tmp = 2;
		for (int i = n-1; i >= 0; i--) {
			for (int j = 0; j < tmp; j++) {
//				System.out.print(" ");
				res.append(" ");
			}
//			res.append("$");
			for (int j = 0; j <= i; j++) {
				res.append("" + j );
				if(i != 0)
					res.append(" ");
			}
			for (int j = i -1; j >= 0; j--) {
//				System.out.print("" + j + " ");
				res.append("" + j);
				if (j != 0)
					res.append(" ");
			}
			tmp += 2;
			res.append("\n");
		}
		System.out.println(res);
		
	}
	
}
