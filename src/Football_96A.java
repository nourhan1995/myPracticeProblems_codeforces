import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Football_96A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int c1 = 0;
		int c2 = 0;
		boolean flag = true;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '1'){
				c1++;
				c2 = 0;
				if(c1 == 7){
					flag = false;
					System.out.println("YES");
					break;
				}
			}else{
				c1 = 0;
				c2++;
				if(c2 == 7){
					flag = false;
					System.out.println("YES");
					break;
				}
			}
		}
		if(flag)
			System.out.println("NO");
		
	}

}
