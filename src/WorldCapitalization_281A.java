import java.io.BufferedReader;
import java.io.*;

public class WorldCapitalization_281A {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		if(input.charAt(0) >= 'A' && input.charAt(0) <= 'Z')
			System.out.println(input);
		else
			System.out.println((input.charAt(0)+"").toUpperCase()+input.substring(1));
		
	}

}
