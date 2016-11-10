import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class XeniaAndDivisors_342A {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int[] a = new int[n];
		StringTokenizer s = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = new Integer(s.nextToken());
		}
		Hashtable<Integer, Integer> contains = new Hashtable<>();
		for (int i = 0; i < a.length; i++) {
			if(contains.containsKey(a[i])){
				contains.put(a[i], contains.remove(a[i]) + 1);
			}else
				contains.put(a[i], 1);
		}
		if(!contains.containsKey(1))
			System.out.println(-1);
		else{
			n /= 3;
			if(contains.containsKey(1) && contains.get(1) == n ){
				if(contains.containsKey(2) && contains.get(2) == n){
					if(contains.containsKey(4) && contains.get(4) == n){
						for (int i = 0; i < n; i++) {
							System.out.println("1 2 4");
						}
					}else{
						if(contains.containsKey(6) && contains.get(6) == n){
							for (int i = 0; i < n; i++) {
								System.out.println("1 2 6");
							}
						}else{
							if(contains.containsKey(4) && contains.containsKey(6) && contains.get(4) + contains.get(6) == n){
								for (int i = 0; i < contains.get(4); i++) {
									System.out.println("1 2 4");
								}
								for (int i = 0; i < contains.get(6); i++) {
									System.out.println("1 2 6");
								}
							}else
								System.out.println(-1);
						}
					}
				}else{
					if(contains.containsKey(3) && contains.get(3) == n){
						if(contains.containsKey(6) && contains.get(6) == n){
							for (int i = 0; i < n; i++) {
								System.out.println("1 3 6");
							}
						}else
							System.out.println(-1);
					}else{
						if(contains.containsKey(2) && contains.containsKey(3) && contains.get(2) + contains.get(3) == n){
							if(contains.containsKey(6) && contains.get(6) == n){
								for (int i = 0; i < contains.get(2); i++) {
									System.out.println("1 2 6");
								}
								for (int i = 0; i < contains.get(3); i++) {
									System.out.println("1 3 6");
								}
							}else{
								if(contains.containsKey(4) && contains.containsKey(6) && contains.get(4) + contains.get(6) == n && contains.get(6) >= contains.get(3)){
									for (int i = 0; i < contains.get(4); i++) {
										System.out.println("1 2 4");
									}
									for (int i = 0; i < contains.get(3); i++) {
										System.out.println("1 3 6");
									}
									if(contains.get(6) > contains.get(3)){
										for (int i = 0; i < contains.get(6)-contains.get(3); i++) {
											System.out.println("1 2 6");
										}
									}
								}else
									System.out.println(-1);
							}
						}else
							System.out.println(-1);
					}
				}
			}else
				System.out.println(-1);
		}
		
	}

}
