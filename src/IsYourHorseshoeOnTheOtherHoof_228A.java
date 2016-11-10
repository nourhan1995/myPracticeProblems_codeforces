import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class IsYourHorseshoeOnTheOtherHoof_228A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Hashtable<Integer, Boolean> has = new Hashtable<>();
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			int cur = new Integer(s.nextToken());
			if(!has.containsKey(cur))
				has.put(cur, true);
		}
		System.out.println(4-has.size());
		
	}

}
