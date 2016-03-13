import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


// to be completed
public class HamiltonianSpanningTree_WunderFund {
	
	static ArrayList<Node> [] map;
	static int [] visited;
	static int n, x, y;
	
	static class Node{
		int n, c;
		public Node(int n, int c){
			this.n = n;
			this.c = c;
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		n = new Integer(s.nextToken());
		x = new Integer(s.nextToken());
		y = new Integer(s.nextToken());
		map = new ArrayList[n];
		visited = new int[n];
		for (int i = 0; i < map.length; i++) {
			map[i] = new ArrayList<>();
		}
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j)
					continue;
				else{
					map[i].add(new Node(j, y));
					map[j].add(new Node(i, y));
				}
			}
		}
		for (int i = 0; i < n-1; i++) {
			StringTokenizer s1 = new StringTokenizer(br.readLine());
			int u = new Integer(s1.nextToken()) - 1;
			int v = new Integer(s1.nextToken()) - 1;
			map[u].get(v).c = x;
			map[v].get(u).c = x;
		}
		
	}
	
	// first we will dijkstra to get the shortest path from any first arbitrary node
	// let it be node one for convenience
	// we will then loop on the visited array and dfs from the node with the maximum cost
	// we will then get the path needed

}
