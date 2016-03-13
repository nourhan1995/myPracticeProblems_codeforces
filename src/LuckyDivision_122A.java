import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LuckyDivision_122A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Boolean flag = true;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != '4' || s.charAt(i) != '7'){
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("YES");
		else{
			int n = new Integer(s);
			int [] luckyNos = new int [14];
			luckyNos[0] = 4;
			luckyNos[1] = 7;
			luckyNos[2] = 44;
			luckyNos[3] = 47;
			luckyNos[4] = 74;
			luckyNos[5] = 77;
			luckyNos[6] = 444;
			luckyNos[7] = 447;
			luckyNos[8] = 474;
			luckyNos[9] = 477;
			luckyNos[10] = 744;
			luckyNos[11] = 747;
			luckyNos[12] = 774;
			luckyNos[13] = 777;
			flag = false;
			for (int i = 0; i < luckyNos.length; i++) {
				if(n % luckyNos[i] == 0 && n >= luckyNos[i]){
					flag = true;
					break;
				}
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
	}

}
