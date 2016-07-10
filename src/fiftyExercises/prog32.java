/**
 * 
 */

package fiftyExercises;

import java.util.Scanner;

/**
 * 取一个整数 a 从右端开始的 4～7 位。 
 * 
 * @author nandi
 * 2015年12月21日
 * prog32.java
 */
public class prog32 {
	
	public static void printNum() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("输入一个整数,必须大于1,000,000:");
		long a = s.nextLong();
		if (a < 1000000) {
			System.err.println("unproperly number");
			System.exit(0);
		}
		
		System.out.println("a = " + a);
		
		String str = Long.toString(a);
		
		for (int i = 6; i >= 3; i--) {
			System.out.println("第" + (10 - i) + "位是：" + str.charAt(i));
		}
		s.close();
	}
	
	public static void main(String[] args) {
		
		printNum();
	}
}
