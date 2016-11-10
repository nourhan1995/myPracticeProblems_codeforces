import java.util.*;
import java.io.*;

public class BeautifulYear_271A {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		do {
			int n = new Integer(s);
			s = (n+1)+"";
		} while (!checkUnique(s));
		System.out.println(s);
		
	}
	
	public static boolean checkUnique(String s){
//		System.out.println(s);
		Hashtable<Character, Integer> h = new Hashtable<>();
		for (int i = 0; i < s.length(); i++) {
			if(h.containsKey(s.charAt(i)))
				return false;
			else
				h.put(s.charAt(i), 0);
		}
		return true;
	}

}
