import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

public class AmusingJoke_141A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Hashtable<Character, Integer> found = new Hashtable<>();
		String s = br.readLine();
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if(!found.containsKey(cur))
				found.put(cur, 1);
			else
				found.put(cur, found.remove(cur) + 1);
		}
		s = br.readLine();
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if(!found.containsKey(cur))
				found.put(cur, 1);
			else
				found.put(cur, found.remove(cur) + 1);
		}
		s = br.readLine();
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if(!found.containsKey(cur))
				found.put(cur, -1);
			else
				found.put(cur, found.remove(cur) - 1);
		}
		Enumeration<Character> keys = found.keys();
		boolean flag = true;
		while(keys.hasMoreElements()){
			int cur = found.get(keys.nextElement());
			if(cur != 0){
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

}
