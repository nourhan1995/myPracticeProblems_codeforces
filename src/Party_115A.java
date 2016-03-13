import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Party_115A {

	static int [] visited;
	static boolean [][] map;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		visited = new int[n];
		map = new boolean[n][n];
		for (int i = 0; i < map.length; i++) {
			Arrays.fill(map[i] , false);
		}
		ArrayList<Integer> roots = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			int cur = new Integer(br.readLine());
			if(cur == -1)
				roots.add(i-1);
			else
				map[cur-1][i-1] = true;
		}
//		for (int i = 0; i < map.length; i++) {
//			System.out.println(Arrays.toString(map[i]));
//		}
		Arrays.fill(visited, -1);
		int max = 0;
		for (int i = 0; i < roots.size(); i++) {
			bfs(roots.get(i));
			max = 0;
//			System.out.println(Arrays.toString(visited));
			for (int i1 = 0; i1 < visited.length; i1++) {
				if(visited[i1] > max)
					max = visited[i1];
			}
		}
		System.out.println(max);

	}

	public static void bfs(int s){
//		System.out.println("root" + s);
		LinkedList<Node> q = new LinkedList<>();
		q.add(new Node(s, 1));
		visited[s] = 1;
		while(!q.isEmpty()){
			Node cur = q.poll();
//			System.out.println("node " + cur.n);
			if(visited[cur.n] == -1)
				visited[cur.n] = cur.w;
			for (int i = 0; i < map[cur.n].length; i++) {
				if(map[cur.n][i] == true && visited[i] == -1){
//					System.out.println("weight " + (cur.w + 1));
					q.add(new Node(i, cur.w+1));
				}
			}
		}
	}

	static class Node{
		int n, w;
		public Node(int n, int w){
			this.n = n;
			this.w = w;
		}
	}

}
