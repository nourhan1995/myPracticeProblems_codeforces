import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostcardsAndPhotos_137A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int carry = 0;
		int count = 0;
		//		boolean flag = false;
		for (int i = 0; i < input.length(); i++) {
			if(i == 0)
				carry++;
			else{
				if(input.charAt(i) == input.charAt(i-1)){
					carry++;
					if(carry > 5){
						carry = 1;
						count++;
					}
				}else{
					carry = 1;
					count++;
				}

			}
		}
		if(carry != 0)
			count++;
		System.out.println(count);

	}

}
