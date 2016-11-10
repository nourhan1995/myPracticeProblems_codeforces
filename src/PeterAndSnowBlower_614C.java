import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PeterAndSnowBlower_614C {

	static Point p;

	static class Point {
		double x, y;

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

	// static class Line {
	// Point p1, p2;
	// double m;
	//
	// public Line(Point p1, Point p2) {
	// this.p1 = p1;
	// this.p2 = p2;
	// m = (double) ((this.p2.y - this.p1.y) / (this.p2.x - this.p1.x));
	// }
	//
	//
	// }

	static class Line {

		static final double INF = 1e9, EPS = 1e-9;
		double a, b, c;

		public Line(Point p, Point q) {
			if (Math.abs(p.x - q.x) < EPS) {
				a = 1;
				b = 0;
				c = -p.x;
			} else {
				a = (p.y - q.y) / (q.x - p.x);
				b = 1.0;
				c = -(a * p.x + p.y);
			}
		}

		public Line(Point p, double m) {
			a = -m;
			b = 1;
			c = -(a * p.x + p.y);
		}

		public boolean parallel(Line l) {
			return Math.abs(a - l.a) < EPS && Math.abs(b - l.b) < EPS;
		}

		public boolean same(Line l) {
			return parallel(l) && Math.abs(c - l.c) < EPS;
		}

		public Point intersect(Line l) {
			if (parallel(l))
				return null;
			double x = (b * l.c - c * l.b) / (a * l.b - b * l.a);
			double y;
			if (Math.abs(b) < EPS)
				y = -l.a * x - l.c;
			else
				y = -a * x - c;
			return new Point(x, y);
		}

		public Point closestPoint(Point p) {
			if (Math.abs(b) < EPS)
				return new Point(-c, p.y);
			if (Math.abs(a) < EPS)
				return new Point(p.x, -c);
			return intersect(new Line(p, 1 / a));
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = new Integer(s.nextToken());
		p = new Point(new Double(s.nextToken()), new Double(s.nextToken()));
		double R_sq = 0;
		double r_sq = 1e9;
		ArrayList<Point> points = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			s = new StringTokenizer(br.readLine());
			Point p2 = new Point(new Double(s.nextToken()), new Double(s.nextToken()));
			points.add(p2);
			R_sq = Math.max(R_sq, calculate_dis(p, p2));
//			System.out.println("max R so far: " + R_sq);
		}
		for (int i = 0; i < points.size(); i++) {
			Point p1 = points.get(i);
			Point p2;
			if(i == n-1)
				p2 = points.get(0);
			else
				p2 = points.get(i+1);	
			Point c = (new Line(p1, p2)).closestPoint(p);
//			System.out.println("point of intersection c: " + c.x + ", " + c.y);
			if (calculate_dis(c, p1) + calculate_dis(c, p2) == calculate_dis(p1, p2)){
//				System.out.println("point lies on line segment");
				r_sq = Math.min(r_sq, calculate_dis(p, (new Line(p1, p2)).closestPoint(p)));
//				System.out.println("min r so far: " + r_sq);
			}else{
//				System.out.println("point doesn't lie on line segment");
				r_sq = Math.min(r_sq, calculate_dis(p, p1));
//				System.out.println("min r so far: " + r_sq);
				r_sq = Math.min(r_sq, calculate_dis(p, p2));
//				System.out.println("min r so far: " + r_sq);
			}
		}
		double area = Math.PI * (R_sq*R_sq - r_sq*r_sq);
		System.out.println((double) area);

	}

	public static double calculate_dis(Point p, Point a) {
		return Math.sqrt((p.x - a.x) * (p.x - a.x) + (p.y - a.y) * (p.y - a.y));
	}

}
