import java.io.*;
import java.util.*;

public class SimpleMolecules {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int a = new Integer(s.nextToken());
		int b = new Integer(s.nextToken());
		int c = new Integer(s.nextToken());
		if ((a + b + c) % 2 != 0)
			System.out.println("Impossible");
		else {
			int y = (b + c - a) / 2;
			int x = b - y;
			int z = a - x;
			if (y < 0 || x < 0 || z < 0 || (x == 0 && y == 0) || (x == 0 && z == 0) || (y == 0 && z == 0)
					|| (x == 0 && y == 0 && z == 0))
				System.out.println("Impossible");
			else
				System.out.println(x + " " + y + " " + z);
		}

	}

}
