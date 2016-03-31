import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


// wrong result tutorial to be checked
public class TanyaAndToys_659C {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		int n = new Integer(s1.nextToken());
		int m = new Integer(s1.nextToken());
		int[] a = new int[n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = new Integer(s.nextToken());
		}
		Arrays.sort(a);
		int i = 1;
		int j = 0;
		int sum = 0;
		int count = 0;
		ArrayList<Integer> res = new ArrayList<>();
		while (sum < m) {
			if (j < a.length) {
				if (a[j] > i && sum + a[j] <= m) {
					sum += i;
					res.add(i);
					count++;
					i++;
				} else {
					if (i == a[j])
						i++;
					j++;
				}
			}else{
				sum += i;
				res.add(i);
				count++;
				i++;
			}
		}
		System.out.println(count);
		for (int k = 0; k < res.size(); k++) {
			System.out.print(res.get(k) + " ");
		}

	}

}
