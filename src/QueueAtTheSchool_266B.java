import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QueueAtTheSchool_266B {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		int t = new Integer(s.nextToken());
		String queue = br.readLine();
		while(t-- > 0){
			String res = "";
			for (int i = 0; i < queue.length(); i++) {
				if(queue.charAt(i) == 'G')
					res += "G";
				else{
					if(i+1 < queue.length() && queue.charAt(i+1) == 'G'){
						res += "GB";
						i++;
					}else
						res += "B";
				}
			}
			queue = res;			
		}
		System.out.println(queue);
		
	}

}
