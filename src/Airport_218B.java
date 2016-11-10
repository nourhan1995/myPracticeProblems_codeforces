import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Airport_218B {
	
	static class IntegerModified implements Comparable<IntegerModified>{
		int x;
		public IntegerModified(int x){
			this.x = x;
		}
		@Override
		public int compareTo(IntegerModified o) {
			// TODO Auto-generated method stub
			return -1 * (x - o.x);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int m = new Integer(s.nextToken());
		PriorityQueue<IntegerModified> max = new PriorityQueue<>();
		PriorityQueue<Integer> min = new PriorityQueue<>();
		s = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int cur = new Integer(s.nextToken());
			max.add(new IntegerModified(cur));
			min.add(cur);
		}
		int sum_max = 0, sum_min = 0;
		for (int i = 0; i < n; i++) {
			int cur = max.poll().x;
			sum_max += cur;
			cur--;
			if(cur > 0)
				max.add(new IntegerModified(cur));
		}
		for (int i = 0; i < n; i++) {
			int cur = min.poll();
			sum_min += cur;
			cur--;
			if(cur > 0)
				min.add(cur);
		}
		System.out.println("" + sum_max + " " + sum_min);
		
	}

}
