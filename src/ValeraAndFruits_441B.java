import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// to be traced
public class ValeraAndFruits_441B {

	static class Pair implements Comparable<Pair> {

		int day, capacity;

		public Pair(int day, int capacity) {
			this.day = day;
			this.capacity = capacity;
		}

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			if (this.day != o.day)
				return this.day - o.day;
			return this.capacity - o.capacity;
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int noOfDays = new Integer(s.nextToken());
		int max = new Integer(s.nextToken());
		PriorityQueue<Pair> q = new PriorityQueue<>();
		for (int i = 0; i < noOfDays; i++) {
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			q.add(new Pair((new Integer(s1.nextToken())) - 1, new Integer(s1.nextToken())));
		}
		int day[] = new int[noOfDays + 1];
		int cur = 0;
		int sum = 0;
		for (int i = 0; i < day.length - 1; i++) {
			Pair p = q.poll();
			if (cur + p.capacity <= max) {
				day[i] = cur + p.capacity;
				cur = 0;
			} else {
				day[i] = max;
				int tv = Math.max(max - cur, 0);
				if(tv == 0)
					tv = max;
				cur = p.capacity - tv;
			}
			sum += day[i];
		}
		if (cur + day[noOfDays] > max)
			day[noOfDays] = max;
		else
			day[noOfDays] += cur;
		// System.out.println(Arrays.toString(day));
		System.out.println(sum + day[noOfDays]);

	}

}
