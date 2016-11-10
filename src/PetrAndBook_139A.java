import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class PetrAndBook_139A {

	static class Pair {

		int index, pages;

		public Pair(int index, int pages) {
			this.index = index;
			this.pages = pages;
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		LinkedList<Pair> q = new LinkedList<>();
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 1; i <= 7; i++) {
			q.add(new Pair(i, new Integer(s.nextToken())));
		}
		// if(q.peek().pages < 1)
		// System.out.println(1);
		// else{
		while (n > 0) {
			Pair p = q.poll();
			n -= p.pages;
			q.add(p);
		}
		System.out.println(q.getLast().index);
		// }

	}

}
