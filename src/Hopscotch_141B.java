import java.io.*;
import java.util.*;

public class Hopscotch_141B {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int a = new Integer(s.nextToken());
		int x = new Integer(s.nextToken());
		int y = new Integer(s.nextToken());
		if (y == 0)
			System.out.println("-1");
		else {
			int level = 0;
			if (y >= a)
				level = y / a ;
//			System.out.println(level);
			if (level % 2 != 0) {
				if (x >= ((double) a / 2) || x * (-1) >= ((double) a / 2))
					System.out.println("-1");
				else {
					if (y > level * a && y < (level * a) + a) {
						if (level == 1)
							System.out.println("2");
						else
							System.out.println(level + (level / 2) + 1);
					} else
						System.out.println(-1);
				}
			} else {
				if (level == 0) {
					if (x >= ((double) a / 2) || x * (-1) >= ((double) a / 2))
						System.out.println("-1");
					else {
						if (y > 0 && y < a) {
							System.out.println(1);
						} else
							System.out.println(-1);
					}
				} else {
					if(x == 0)
						System.out.println(-1);
					else{
						if(x > 0 && x >= a)
							System.out.println(-1);
						else{
							if(x < 0 && x*(-1) >= a)
								System.out.println(-1);
							else{
								if(x > 0){
									if (y > level * a && y < (level * a) + a) {
										System.out.println(level + (level / 2) + 1);
									} else
										System.out.println(-1);
								}else{
									if (y > level * a && y < (level * a) + a) {
										System.out.println(level + (level / 2));
									} else
										System.out.println(-1);
								}
							}
						}
					}
//					if (x >= a || x * (-1) >= a) {
//						System.out.println(-1);
//					} else {
//						if (x == 0)
//							System.out.println(-1);
//						else {
//							if(x > 0){
//								if (y > 0 && y < a) {
//									System.out.println(level + (level / 2) + 1);
//								} else
//									System.out.println(-1);
//							}else{
//								if (y < 0 && y > -1 * a) {
//									System.out.println(level + (level / 2));
//								} else
//									System.out.println(-1);
//							}
//						}
//					}
				}
			}
		}

	}

}
