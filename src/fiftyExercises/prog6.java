/**
 * 
 */
package fiftyExercises;

import java.util.Scanner;

/**
 * �������������� m �� n���������Լ������С��������
 * 
 * @author nandi
 * 2015��12��9��
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
		
		System.out.print("�������������:");
		
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		
		System.out.println(m + " �� " + n + " �����Լ���� " + gcd(m, n));
		System.out.println(m + " �� " + n + " ����С�������� " + lcm(m, n));
		
		System.out.println();
		
		s.close();
	}
}
