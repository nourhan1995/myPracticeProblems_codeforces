import java.io.*;
import java.util.*;

public class Queue_141C {

	static class People implements Comparable<People> {

		String name;
		int a;
		int h;

		People(String name, int a) {
			this.name = name;
			this.a = a;
			this.h = 0;
		}

		People(String name, int a, int h) {
			this.name = name;
			this.a = a;
			this.h = h;
		}

		@Override
		public int compareTo(People o) {
			// TODO Auto-generated method stub
			if (this.a != o.a)
				return this.a - o.a;
			else
				return this.name.compareTo(o.name);
		}

	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		LinkedList<People> res = new LinkedList();
		People[] p = new People[n];
		for (int i = 0; i < p.length; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			p[i] = new People(s.nextToken(), new Integer(s.nextToken()));
		}
		Arrays.sort(p);
		boolean flag = true;
		for (int i = 0; i < p.length; i++) {
			if (p[i].a > i) {
				flag = false;
				break;
			} else {
				if (p[i].a == 0)
					res.add(p[i]);
				else
					res.add(p[i].a, p[i]);
			}
		}
		if (!flag)
			System.out.println(-1);
		else {
			// for (int i = 0; i < res.size(); i++) {
			// System.out.println(res.get(i).name + " " + res.get(i).a);
			// }
			int max = n;
			int min = n;
			for (int i = 0; i < res.size(); i++) {
				if (i == 0)
					res.get(0).h = n;
				else {
					if (res.get(i).a == 0)
						res.get(i).h = ++max;
					else
						res.get(i).h = --min;
				}
			}
			while (!res.isEmpty()) {
				People cur = res.poll();
				System.out.println(cur.name + " " + cur.h);
			}
		}

	}

}
