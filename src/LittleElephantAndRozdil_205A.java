import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LittleElephantAndRozdil_205A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		StringTokenizer s = new StringTokenizer(br.readLine());
		long min = 1000000001;
		int city = -1;
		int c = 0;
		for (int i = 0; i < n; i++) {
			int cur = new Integer(s.nextToken());
			if(cur < min){
				min = cur;
				city = i+1;
				c = 0;
			}else{
				if(cur == min){
					c++;
				}
			}
		}
		if(c >= 1)
			System.out.println("Still Rozdil");
		else
			System.out.println(city);
		
	}

}
