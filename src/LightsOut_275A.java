import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LightsOut_275A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [][] map = new int [3][3];
		for (int i = 0; i < map.length; i++) {
			Arrays.fill(map[i], 1);
		}
		int [][] cur_map = new int [3][3];
		for (int i = 0; i < cur_map.length; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			for (int j = 0; j < cur_map[i].length; j++) {
				cur_map[i][j] = new Integer(s.nextToken());
			}
		}
		
		for (int i = 0; i < cur_map.length; i++) {
			for (int j = 0; j < cur_map[i].length; j++) {
				int cur = cur_map[i][j];				
				while(cur > 0){
					cur--;
					map[i][j] ^= 1;
					int [] dx = {0, 0, 1, -1};
					int [] dy = {1, -1, 0, 0};
					for (int k = 0; k < dy.length; k++) {
						int new_i = i + dx[k];
						int new_j = j + dy[k];
						if(new_i >= 0 && new_i < 3){
							map[new_i][j] ^= 1;
						}
						if(new_j >= 0 && new_j < 3){
							map[i][new_j] ^= 1;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < map.length; i++) {
			System.out.println("" + map[i][0] + map[i][1] + map[i][2]);
		}
		
	}

}
