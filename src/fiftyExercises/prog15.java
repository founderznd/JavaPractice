/**
 * 
 */

package fiftyExercises;

import java.util.Scanner;

/**
 * ������������x,y,z���������������С���������
 * 
 * @author nandi
 * 2015��12��10��
 * prog15.java
 */
public class prog15 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x, y, z;
		int tmp;
		System.out.print("input 3 numbers: ");
		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();
		
		if (x > y) {
			tmp = x;
			x = y;
			y = tmp;
		}
		if (x > z) {
			tmp = x;
			x = z;
			z = tmp;
		}
		if (y > z) {
			tmp = z;
			z = y;
			y = tmp;
		}
		
		System.out.println(x + " " + y + " " + z);
		s.close();
	}
}
