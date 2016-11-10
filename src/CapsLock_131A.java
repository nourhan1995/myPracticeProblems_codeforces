import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapsLock_131A {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char firstChar = input.charAt(0);
		if(firstChar >= 'a' && firstChar <= 'z'){
			boolean flag = true;
			for (int i = 1; i < input.length(); i++) {
				if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'){
					flag = true;
				}else{
					flag = false;
					break;
				}
			}
			if(flag){
				String result = (firstChar+"").toUpperCase();
				result += (input.substring(1)).toLowerCase();
				System.out.println(result);	
			}else
				System.out.println(input);
		}else{
			boolean flag = true;
			for (int i = 1; i < input.length(); i++) {
				if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'){
					flag = true;
				}else{
					flag = false;
					break;
				}
			}
			if(flag){
//				String result = (firstChar+"").toUpperCase();
//				result += (input.substring(1)).toLowerCase();
				System.out.println(input.toLowerCase());	
			}else
				System.out.println(input);
//			String result = firstChar+"";
//			result += (input.substring(1)).toLowerCase();
//			System.out.println(result);			
		}
	}
	
}
