import java.io.*;

public class DesignTutorialLearnFromMath_472A {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		if(n%2 == 0){
			int tmp = n - 8;
			System.out.println("8 " + tmp);
		}else{
			int tmp = n - 9;
			System.out.println("9 " + tmp);
		}
		
	}
	
}
