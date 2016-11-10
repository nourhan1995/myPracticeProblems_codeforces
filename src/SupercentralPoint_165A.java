import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SupercentralPoint_165A {
	
	static class Pair{
		
		int x, y;
		public Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		Pair [] co_ord = new Pair[n];
		for (int i = 0; i < co_ord.length; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			co_ord[i] = new Pair(new Integer(s.nextToken()), new Integer(s.nextToken()));
		}
		int c = 0;
		for (int i = 0; i < co_ord.length; i++) {
			Pair cur = co_ord[i];
			boolean left = false;
			boolean right = false;
			boolean upper = false;
			boolean lower = false;
			for (int j = 0; j < co_ord.length; j++) {
				if(j != i){
					Pair tmp = co_ord[j];
					if(tmp.x > cur.x && tmp.y == cur.y)
						right = true;
					if(tmp.x < cur.x && tmp.y == cur.y)
						left = true;
					if(tmp.x == cur.x && tmp.y < cur.y)
						lower = true;
					if(tmp.x == cur.x && tmp.y > cur.y)
						upper = true;
				}
			}
			if(left && right && upper && lower)
				c++;
		}
		System.out.println(c);
		
	}

}
