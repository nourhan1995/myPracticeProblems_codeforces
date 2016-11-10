import java.util.*;
import java.io.*;

public class VanyaAndProcessor_677B {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		int n = new Integer(s1.nextToken());
		int h = new Integer(s1.nextToken());
		int k = new Integer(s1.nextToken());
		Queue<Integer> q = new LinkedList<>();
		StringTokenizer s = new StringTokenizer(br.readLine());
		while (s.hasMoreElements()) {
			q.add(new Integer(s.nextToken()));
		}
		long t = 0;
		int inside = 0;
		while (!q.isEmpty()) {
			int cur = q.poll();
//			System.out.println(cur);
			boolean flag = false;
			while(cur <= (h-inside)){
				inside += cur;
				if(!q.isEmpty()){
					cur = q.poll();
//					System.out.println(cur);
				}else{
					flag = true;
					break;
				}
			}
			if(!flag && cur > (h-inside)){
//				System.out.println("entered if statement " + cur);
				t += inside / k;
				inside %= k;
				if(cur > (h - inside)){
					t++;
					inside = cur;
				}else
					inside += cur;
			}
//			System.out.println(t);
		}
		if(q.isEmpty() && inside > 0) {
			t += inside / k;
			inside %= k;
			if(inside != 0) 
				t++;
		}
		System.out.println(t);

	}

}
