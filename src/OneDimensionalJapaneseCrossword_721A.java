import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OneDimensionalJapaneseCrossword_721A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		String input = br.readLine();
		ArrayList<Integer> res = new ArrayList<>();
		int black = 0;
		for (int i = 0; i < n; i++) {
			if(input.charAt(i) == 'B')
				black++;
			else{
				if(black != 0){
					res.add(black);
					black = 0;
				}
			}
		}
		if(black != 0){
			res.add(black);
			black = 0;
		}
		System.out.println(res.size());
		for (int i = 0; i < res.size(); i++) {
			System.out.print(res.get(i) + " ");
		}
		
	}

}
