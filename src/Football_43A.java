import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

public class Football_43A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		Hashtable<String, Integer> map = new Hashtable<>();
		for (int i = 0; i < n; i++) {
			String cur = br.readLine();
			if(map.containsKey(cur)){
				map.put(cur, map.remove(cur)+ 1);
			}else
				map.put(cur, 1);
		}
		Enumeration<String> keys = map.keys();
		String winner = "";
		int max = 0;
		while(keys.hasMoreElements()){
			String cur = keys.nextElement();
			if(map.get(cur) > max){
				max = map.get(cur);
				winner = cur;
			}
		}
		System.out.println(winner);
		
	}

}
