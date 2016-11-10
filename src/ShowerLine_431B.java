import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShowerLine_431B {

	static int[][] map;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		map = new int[5][5];
		for (int i = 0; i < map.length; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = new Integer(s.nextToken());
			}
		}
		int max = 0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (j != i) {
					for (int k = 0; k < map.length; k++) {
						if (k != i && k != j) {
							for (int l = 0; l < map.length; l++) {
								if (l != k && l != j && l != i) {
									for (int m = 0; m < map.length; m++) {
										if (m != l && m != k && m != j && m != i) {
											// calculate happiness
											int[] a = { i, j, k, l, m };
											max = Math.max(max, calculateHappiness(a));
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(max);

	}

	public static int calculateHappiness(int[] a) {
		int sum = 0;
		for (int n = 0; n < a.length; n++) {
			for (int i = n; i < a.length; i += 2) {
				if(i+1 < 5){
					sum += map[a[i]][a[i+1]] + map[a[i+1]][a[i]];
				}
			}
		}
		return sum;
	}

}
