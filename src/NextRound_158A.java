import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NextRound_158A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int k = new Integer(s.nextToken());
		//		System.out.println(k);
		int [] scores = new int [n];
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		//		int cur = new Integer(s1.nextToken());
		//		System.out.println(cur);
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new Integer(s1.nextToken());
		}
		int target = scores[k-1];
		count = 0;
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] >= target && scores[i] > 0)
				count++;
		}

		System.out.println(count);
	}

}
