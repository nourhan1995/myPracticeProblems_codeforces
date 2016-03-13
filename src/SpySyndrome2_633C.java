import java.io.BufferedReader;
import java.io.InputStreamReader;


// tutorial to be checked and answered later
public class SpySyndrome2_633C {
	
	static class Trie{
		
		Node root = new Node();
		
		static class Node{
			Node [] next = new Node[26];
			boolean end;
		}
		
		public void insert(String s){
			Node cur = root;
			for (int i = 0; i < s.length(); i++) {
				if(cur.next[s.charAt(i)-'a'] == null)
					cur.next[s.charAt(i) - 'a'] = new Node();
				cur = cur.next[s.charAt(i) - 'a'];
			}
			cur.end = true;
		}
		
	}
	
	public static void main(String[] args) {	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	}

}
