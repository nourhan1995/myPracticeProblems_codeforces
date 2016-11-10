import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// wrong answer on pretest 7
public class Checkpoints_709B {

	static class Pair implements Comparable<Pair> {

		int x, dis;

		public Pair(int x, int dis) {
			this.x = x;
			this.dis = dis;
		}

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			if (this.dis != o.dis)
				return this.dis - o.dis;
			else
				return this.x - o.x;
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = new Integer(st.nextToken());
		Pair a = new Pair(new Integer(st.nextToken()), 0);
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int cur = new Integer(s.nextToken());
			pq.add(new Pair(cur, Math.abs(a.x - cur)));
		}
		long sum = 0;
		for (int i = 0; i < n - 1; i++) {
			Pair cur = pq.poll();
			sum += Math.abs(a.x - cur.x);
			a.x = cur.x;
		}
		System.out.println(sum);
	}

}
