/**
 * 
 */
package fiftyExercises;

import java.util.Scanner;

/**
 * 输入两个正整数 m 和 n，求其最大公约数和最小公倍数。
 * 
 * @author nandi
 * 2015年12月9日
 * prog6.java
 */
public class prog6 {
	
	public static int gcd(int m, int n) {
		
		if (m == n) { return m; }
		
		if (m > n) { return gcd(n, m - n); }
		return gcd(n, m);
	}
	
	public static int lcm(int m, int n) {
		
		int tmp = m;
		while (m % n != 0) {
			m = m + tmp;
		}
		return m;
	}
	
	public static void main(String[] args) {
		
		System.out.print("输出两个正整数:");
		
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		
		System.out.println(m + " 和 " + n + " 的最大公约数是 " + gcd(m, n));
		System.out.println(m + " 和 " + n + " 的最小公倍数是 " + lcm(m, n));
		
		System.out.println();
		
		s.close();
	}
}
