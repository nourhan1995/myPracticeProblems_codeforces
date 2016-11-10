import java.io.*;
import java.util.*;

public class CalculatingFunction_486A {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = new Long(br.readLine());
		if(n % 2 == 0)
			System.out.println((long)n/2);
		else
			System.out.println((long)-(n+1)/2);
		
	}

}
