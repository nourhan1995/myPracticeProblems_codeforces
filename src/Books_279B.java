import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Books_279B {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		int n = new Integer(s1.nextToken());
		int t = new Integer(s1.nextToken());
		int [] books = new int [n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < books.length; i++) {
			books[i] = new Integer(s.nextToken());
			if(i > 0)
				books[i] += books[i-1];
		}
		int count = 0;
		for (int i = 0; i < books.length; i++) {
			int start = i;
			int end = books.length-1;
			int lastRead = -1;
			while(start <= end){
				int mid = start +(end - start)/2;
				int timeSoFar = books[mid] - (i > 0? books[i - 1] : 0);
				if(timeSoFar <= t){
					lastRead = mid;
					start = mid + 1;
				}else
					end = mid - 1;
			}
			count = Math.max(count, lastRead - i + 1);
		}

		//		int min = (int) 1e9;
		//		int min_idx = 0;
		//		for (int i = 0; i < books.length; i++) {
		//			if(books[i] < min){
		//				min = books[i];
		//				min_idx = i;
		//			}
		//		}
		//		int count = 0;
		//		for (int i = min_idx; i < books.length; i++) {
		//			if(books[i] <= t){
		//				t -= books[i];
		//				count++;				
		//			}
		//			if(t <= 0)
		//				break;
		//		}
		//		for (int i = 0; i < min_idx; i++) {
		//			if(books[i] <= t){
		//				t -= books[i];
		//				count++;				
		//			}
		//			if(t <= 0)
		//				break;
		//		}
		System.out.println(count);

	}

}
