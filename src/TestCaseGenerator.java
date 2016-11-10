import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestCaseGenerator {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter p = new PrintWriter(new File("PashmakAndFlowers_459B.in"));
		int n = new Integer(br.readLine());
		int val = new Integer(br.readLine());
		p.println(n);
		for (int i = 0; i < n; i++) {
			p.print(val + " ");
		}
		p.println();
		p.flush();
		p.close();
		
	}

}
