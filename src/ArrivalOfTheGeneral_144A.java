import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrivalOfTheGeneral_144A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int [] sol = new int [n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		int max = 0;
		int maxIndex = -1;
		int min = (int) 1e9;
		int minIndex = -1;
		for (int i = 0; i < sol.length; i++) {
			sol[i] = new Integer(s.nextToken());
			if(sol[i] < min){
				min = sol[i];
				minIndex = i;
			}else{
				if(sol[i] == min)
					minIndex = i;
			}
			if(sol[i] > max){
				max = sol[i];
				maxIndex = i;
			}
		}
		int res = maxIndex - 1+ n-minIndex;
		if(maxIndex > minIndex)
			res--;
		System.out.println(res);
		
	}

}
