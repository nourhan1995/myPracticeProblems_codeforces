import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class RegisterationSystem_4C {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		Hashtable<String, Boolean> map = new Hashtable<>();
		for (int i = 0; i < n; i++) {
			String cur = br.readLine();
			if(!map.containsKey(cur)){
				map.put(cur, true);
				System.out.println("OK");
			}else{
				int j = 1;
				while(map.containsKey(cur)){
					cur += j;
					j++;
				}
				System.out.println(cur);
			}
		}
		
	}

}
