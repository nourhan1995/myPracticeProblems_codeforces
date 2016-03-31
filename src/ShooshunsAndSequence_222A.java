import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ShooshunsAndSequence_222A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		int n = new Integer(s1.nextToken());
		int index = new Integer(s1.nextToken()) - 1;
		int [] seq = new int [n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new Integer(s.nextToken());
		}
		boolean flag = true;
		for (int i = index; i < seq.length; i++) {
			if(seq[i] != seq[index]){
				flag = false;
				break;
			}
		}
		if(flag){
			int count = -1;
			for (int i = index-1; i >= 0; i--) {
				if(seq[i] != seq[index]){
					count = i;
					break;
				}
			}
			System.out.println(count+1);
		}else
			System.out.println(-1);

	}

}
