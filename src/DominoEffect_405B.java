import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DominoEffect_405B {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int n = new Integer(br.readLine());
		String seq = br.readLine();
		char pre = ' ';
		int preIndx = -1;
		for (int i = 0; i < n; i++) {
			if(seq.charAt(i) == 'L'){
				if(pre == ' ' && i != 0)
					count -= i;
				else{
					if(pre == 'R')
						count += (i-preIndx-1)%2;
				}
				pre = seq.charAt(i);
				preIndx = i;
			}else{
				if(seq.charAt(i) == 'R'){
					pre = seq.charAt(i);
					preIndx = i;
				}else{
					if(pre == ' ' )
						count++;
					else{
						if(pre == 'L')
							count++;
					}
				}
			}
		}
		System.out.println(count);

	}

}
