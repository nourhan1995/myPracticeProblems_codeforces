import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;

// to be continued

public class ComparingTwoLongIntegers_EducationalRound5 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter p = new PrintWriter(new OutputStreamWriter(System.out));
		BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());
		if(a.compareTo(b) == -1)
			p.println("<");
		else{
			if(a.compareTo(b) == 1)
				p.println(">");
			else
				p.println("=");
		}
		p.close();
		p.flush();
	}

}
