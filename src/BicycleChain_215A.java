import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BicycleChain_215A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int [] a = new int [n];
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = new Integer(s1.nextToken());
		}
		int m = new Integer(br.readLine());
		int [] b = new int [m];
		StringTokenizer s2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < b.length; i++) {
			b[i] = new Integer(s2.nextToken());
		}
		ArrayList<Integer> intRatios = new ArrayList<>();
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(b[i] % a[j] == 0)
					intRatios.add(b[i] / a[j]);
			}
		}
		int max = 0;
		for (int i = 0; i < intRatios.size(); i++) {
			if(intRatios.get(i) > max)
				max = intRatios.get(i);
		}
		int countMax = 0;
		for (int i = 0; i < intRatios.size(); i++) {
			if(intRatios.get(i) == max)
				countMax++;
		}
		System.out.println(countMax);
		
	}

}
