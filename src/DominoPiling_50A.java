import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class DominoPiling_50A{
	public static void main(String args []) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int m = new Integer(s.nextToken());
		int n = new Integer(s.nextToken());
		System.out.println((m*n)/2);
	}
}