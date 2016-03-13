import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// to be continued
// you have to find the minimum distance between the center and the polygon 
// ie the minimum distance to any of the polygon's sides
public class PeterAndSnowBlower_339C {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		Point p = new Point(new Integer(s.nextToken()), new Integer(s.nextToken()));
		int max = 0;
		int min = (int) 1e9;
		for (int i = 0; i < n; i++) {
			//StringTokenizer s1 = new StringTokenizer(br.readLine());
			String [] ss = br.readLine().split(" ");
			Point a = new Point(new Integer(ss[0]), new Integer(ss[1]));
			int dis = (p.x - a.x)*(p.x - a.x) + (p.y - a.y)*(p.y - a.y);
			//System.out.println(dis);
			if(dis > max)
				max = dis;
			if(dis < min)
				min = dis;
		}
		//System.out.println("min   " + min);
		//System.out.println("max   " + max);
		double area = Math.PI*max - Math.PI*min;
		System.out.println(area);

	}

}

class Point{
	int x, y;
	public  Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}