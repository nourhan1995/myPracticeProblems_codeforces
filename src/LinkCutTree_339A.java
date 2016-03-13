import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class LinkCutTree_339A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter p = new PrintWriter(new OutputStreamWriter(System.out));
		StringTokenizer s = new StringTokenizer(br.readLine());
		BigInteger l = new BigInteger(s.nextToken());
		BigInteger r = new BigInteger(s.nextToken());
		BigInteger k = new BigInteger(s.nextToken());
		StringBuilder output = new StringBuilder();
		int i = 0;
		BigInteger c = k.pow(i);
		while(!(c.compareTo(r) == 1)){
			if((c.compareTo(l) == 1 || c.compareTo(l) == 0) && (c.compareTo(r) == -1 || c.compareTo(r) == 0)){
				output.append(c + " ");
			}
			c = k.pow(++i);
		}
		if(output.length() == 0)
			p.print("-1");
		else
			p.print(output);
		p.flush();
		p.close();

	}

}
