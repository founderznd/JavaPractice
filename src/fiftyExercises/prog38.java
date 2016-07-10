/**
 * 
 */

package fiftyExercises;

import java.util.Scanner;

/**
 * 写一个函数，求一个字符串的长度，在 main 函数中输入字符串，并输出其长度。
 * 
 * @author nandi
 * 2015年12月21日
 * prog38.java
 */
public class prog38 {
	
	public static void main(String[] args) {
		
		System.out.print("输入一串字符：");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("字符串的长度为：" + str.length());
		s.close();
	}
}
