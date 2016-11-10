import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Parallelepiped_224A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int a1 = new Integer(s.nextToken());
		int a2 = new Integer(s.nextToken());
		int a3 = new Integer(s.nextToken());
		int h = (int) Math.sqrt(a2*a3/a1);
		int l = a2 / h;
		int w = a3 / h;
		System.out.println(4*l + 4*h + 4*w);
		
	}

}
