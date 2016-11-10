import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sail_298B {

	static class Point {
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int t = new Integer(s.nextToken());
		Point start = new Point(new Integer(s.nextToken()), new Integer(s.nextToken()));
		Point end = new Point(new Integer(s.nextToken()), new Integer(s.nextToken()));
		if (start.x == end.x && start.y == end.y)
			System.out.println(0);
		else {
			String input = br.readLine();
			int res = -1;
			for (int i = 0; i < t; i++) {
				switch (input.charAt(i)) {
				case 'S':
					if (start.y > end.y)
						start.y--;
					break;
				case 'N':
					if (start.y < end.y)
						start.y++;
					break;
				case 'E':
					if (start.x < end.x)
						start.x++;
					break;
				case 'W':
					if (start.x > end.x)
						start.x--;
					break;
				}
				if(start.x == end.x && start.y == end.y){
					res = i + 1;
					break;
				}
			}
			System.out.println(res);
		}

	}

}
