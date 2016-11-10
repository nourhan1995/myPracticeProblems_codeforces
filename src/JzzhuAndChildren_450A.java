import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class JzzhuAndChildren_450A {
	
	static class Pair{
		
		int index, val;
		public Pair(int index, int val){
			this.index = index;
			this.val = val;
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = new Integer(st.nextToken());
		int m = new Integer(st.nextToken());
		LinkedList<Pair> q = new LinkedList<>();
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			q.add(new Pair(i,new Integer(s.nextToken())));
		}
		while(q.size() != 1){
			Pair cur = q.poll() ;
			if(cur.val - m > 0)
				q.add(new Pair(cur.index, cur.val-m));
		}
		System.out.println(q.poll().index + 1);
		
	}

}
