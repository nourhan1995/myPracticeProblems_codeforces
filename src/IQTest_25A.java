import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class IQTest_25A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		StringTokenizer s = new StringTokenizer(br.readLine());
		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> odds = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if((new Integer(s.nextToken())) % 2 == 0)
				evens.add(i+1);
			else
				odds.add(i+1);
		}
		if(evens.size() == 1)
			System.out.println(evens.get(0));
		else
			System.out.println(odds.get(0));
		
	}

}
