import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class JeffAndPeriods_352B {
	
	static class Node implements Comparable<Node>{
		int n, p;
		public Node(int n, int p){
			this.n = n;
			this.p = p;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return n - o.n;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter p = new PrintWriter(System.out);
		int n = new Integer(br.readLine());
		Hashtable<Integer, Integer> lastseen = new Hashtable<>();
		Hashtable<Integer, Integer> period = new Hashtable<>();
		Hashtable<Integer, Boolean> failed = new Hashtable<>();
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int cur = new Integer(s.nextToken());
			if(!lastseen.containsKey(cur)){
				lastseen.put(cur, i);
				period.put(cur, 0);
				failed.put(cur, false);
			}else{
				if(!failed.get(cur) && period.get(cur) == 0){
					int tmp = lastseen.remove(cur);
					lastseen.put(cur, i);
					period.remove(cur);
					period.put(cur, i - tmp);
				}else{
					if(!failed.get(cur) && i - lastseen.get(cur) == period.get(cur)){
						lastseen.remove(cur);
						lastseen.put(cur, i);
					}else{
						failed.remove(cur);
						failed.put(cur, true);
					}
				}
			}
		}
		PriorityQueue<Node> q = new PriorityQueue<>();
		Enumeration<Integer> keys = failed.keys();
		while(keys.hasMoreElements()){
			int cur = keys.nextElement();
			if(!failed.get(cur)){
				q.add(new Node(cur, period.get(cur)));
			}
		}
		p.println(q.size());
		while(!q.isEmpty()){
			Node cur = q.poll();
			p.println(cur.n + " " + cur.p);
		}
		p.flush();
		p.close();
		
	}

}
