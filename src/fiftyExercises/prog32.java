/**
 * 
 */

package fiftyExercises;

import java.util.Scanner;

/**
 * ȡһ������ a ���Ҷ˿�ʼ�� 4��7 λ�� 
 * 
 * @author nandi
 * 2015��12��21��
 * prog32.java
 */
public class prog32 {
	
	public static void printNum() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("����һ������,�������1,000,000:");
		long a = s.nextLong();
		if (a < 1000000) {
			System.err.println("unproperly number");
			System.exit(0);
		}
		
		System.out.println("a = " + a);
		
		String str = Long.toString(a);
		
		for (int i = 6; i >= 3; i--) {
			System.out.println("��" + (10 - i) + "λ�ǣ�" + str.charAt(i));
		}
		s.close();
	}
	
	public static void main(String[] args) {
		
		printNum();
	}
}
