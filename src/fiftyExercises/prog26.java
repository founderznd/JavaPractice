/**
 * 
 */

package fiftyExercises;

import java.util.Scanner;

/**
 * 请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继 续 判断第二个字母。
 * 
 * @author nandi
 * 2015年12月10日
 * prog26.java
 */
public class prog26 {
	
	public static void main(String[] args) {
		
		System.out.print("please input the first letter of weekday:");
		Scanner s = new Scanner(System.in);
		String c = s.nextLine();
		if (1 != c.length()) {
			System.err.println("only 1 letter!");
			System.exit(0);
		}
		
		if (c.equals("M") || c.equals("m")) {
			System.out.println("Monday");
		}
		else if (c.equals("F") || c.equals("f")) {
			System.out.println("Friday");
		}
		else if (c.equals("W") || c.equals("w")) {
			System.out.println("Wednesday");
		}
		else if (c.equals("T") || c.equals("t")) {
			System.out.print("input the second letter:");
			c = s.nextLine();
			if (1 != c.length()) {
				System.err.println("only 1 letter!");
				System.exit(0);
			}
			if (c.equals("H") || c.equals("h")) {
				System.out.println("Thursday");
			}
			else if (c.equals("U") || c.equals("u")) {
				System.out.println("Tuesday");
			}
			else {
				System.out.println("have not  the weekday");
				System.exit(0);
			}
		}
		else {
			System.out.println("have not  the weekday");
		}
		
		s.close();
	}
}
