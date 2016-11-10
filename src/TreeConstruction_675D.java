import java.io.*;
import java.util.*;

public class TreeConstruction_675D {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		TreeSet<Integer> tree = new TreeSet<>();
		boolean[] a = new boolean[n - 1];
		StringTokenizer s = new StringTokenizer(br.readLine());
		n--;
		tree.add(new Integer(s.nextToken()));
		TreeSet<Integer> hasLeft = new TreeSet<>();
		while (n-- > 0) {
			int cur = new Integer(s.nextToken());
			tree.add(cur);
			Integer parent = tree.higher(cur);
			if (parent == null) {
				parent = tree.lower(cur);
//				System.out.println("first then part");
			} else {
				if (hasLeft.contains(parent)) {
					parent = tree.lower(cur);
//					System.out.println("then of else part");
				} else {
					hasLeft.add(parent);
				}
			}
			// hasLeft.add(parent);
			System.out.print(parent);
			if (n != 0)
				System.out.print(" ");
		}

	}

}
