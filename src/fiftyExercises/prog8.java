/**
 * 
 */
package fiftyExercises;

import java.util.Scanner;

/**
 * 求s=a + aa + aaa + aaaa + ... + aaa...a的值，多少个数由自己控制
 * 
 * @author nandi
 * 2015年12月9日
 * prog8.java
 */
public class prog8 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("number = ");
		int n = s.nextInt();
		int tmp = n;
		int sum = n;
		System.out.print("sum = ");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(tmp + " + ");
			tmp = 10 * tmp + n;
			sum += tmp;
		}
		System.out.println(tmp + " = " + sum);
		s.close();
	}
	
}
