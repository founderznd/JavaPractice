/**
 * 
 */

package fiftyExercises;

import java.util.Scanner;

/**
 * 编写一个函数，输入 n 为偶数时，调用函数求 1/2+1/4+...+1/n,当输入 n 为奇数时， 调用函数 1/1+1/3+...+1/n(利用指针函数) 
 * 
 * @author nandi
 * 2015年12月21日
 * prog39.java
 */
public class prog39 {
	
	private static double sumRadix(int n) {
		
		double sum = 0;
		
		for (int i = 1; i <= n; i = i + 2) {
			sum = sum + (double) 1 / i;
		}
		return sum;
	}
	
	private static double sumEven(int n) {
		
		double sum = 0;
		
		for (int i = 2; i <= n; i = i + 2) {
			sum = sum + (double) 1 / i;
		}
		return sum;
	}
	
	private static boolean isRadix(int n) {
		
		return (0 == (n % 2)) ? false : true;
	}
	
	public static void calulate() {
		
		System.out.print("输入一个整数：");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println(isRadix(n) ? sumRadix(n) : sumEven(n));
		s.close();
	}
	
	public static void main(String[] args) {
		
		calulate();
		System.exit(0);
	}
	
}
