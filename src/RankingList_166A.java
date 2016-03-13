import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// to be completed
public class RankingList_166A {
	
	static class Pair implements Comparable<Pair>{
		int p, t;
		public Pair(int p, int t){
			this.p = p;
			this.t = t;
		}
		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			if(this.p < o.p || this.p > o.p)
				return this.p - o.p;
			return -1*(this.t - o.t);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		int n = new Integer(s1.nextToken()), k = new Integer(s1.nextToken());
		Pair [] rank = new Pair[n];
		for (int i = 0; i < rank.length; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			rank[i] = new Pair(new Integer(s.nextToken()), new Integer(s.nextToken()));
		}
		Arrays.sort(rank);
//		for (int i = 0; i < rank.length; i++) {
//			System.out.print(rank[i].p + " " + rank[i].t+", ");
//		}
//		System.out.println();
		int sum = 0;
		Pair tmp = rank[rank.length - k];
		for (int i = 0; i < rank.length; i++) {
			if(tmp.p == rank[i].p && tmp.t == rank[i].t)
				sum++;
		}
		System.out.println(sum);
		
	}

}
