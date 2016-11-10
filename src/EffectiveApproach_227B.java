import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class EffectiveApproach_227B {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		Hashtable<String, Integer> elements = new Hashtable<>();
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			elements.put(s1.nextToken(), i);
		}
		int q = new Integer(br.readLine());
		long vasya = 0;
		long petya = 0;
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < q; i++) {
			String search = s.nextToken();
			int index = elements.get(search);
			vasya += index + 1;
			petya += n - index;
		}
		System.out.println("" + vasya + " " + petya);
		
	}

}
