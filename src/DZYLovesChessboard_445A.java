import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DZYLovesChessboard_445A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter p = new PrintWriter(System.out);
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int m = new Integer(s.nextToken());
		char[][] c = new char[n][m];
		for (int i = 0; i < c.length; i++) {
			String input = br.readLine();
			for (int j = 0; j < c[i].length; j++) {
				char cur = input.charAt(j);
				if(cur == '.'){
					if((i+j)%2 == 0)
						cur = 'B';
					else
						cur = 'W';
				}
				p.print(cur);
			}
			p.println();
		}
		p.flush();
		p.close();
		
	}

}
