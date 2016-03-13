import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Dragons_230A {
	
	static class Pair implements Comparable<Pair>{
		
		int strength, bonus;
		
		public Pair(int strength, int bonus){
			this.strength = strength;
			this.bonus = bonus;
		}

		@Override
		public int compareTo(Pair p) {
			// TODO Auto-generated method stub
			if(this.strength < p.strength || this.strength < p.strength)
				return this.strength - p.strength;
			return this.strength - p.strength;
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		int s = new Integer(s1.nextToken());
		int n = new Integer(s1.nextToken());
		Pair [] dragons = new Pair[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer s2 = new StringTokenizer(br.readLine());
			dragons[i] = new Pair(new Integer(s2.nextToken()), new Integer(s2.nextToken()));
		}
		Arrays.sort(dragons);
		boolean flag = true;
		for (int i = 0; i < dragons.length; i++) {
			if(s > dragons[i].strength)
				s += dragons[i].bonus;
			else{
				flag = false;
				break;
			}
		}
		if(!flag)
			System.out.println("NO");
		else
			System.out.println("YES");
		
	}

}
