/**
 * 
 */
package stringPractice;

import java.util.Random;

/**
 * 产生4个随机整数，找出最大的和最小的并打印出来
 * 
 * @author nandi
 * 2015年12月8日
 * NumberSelect.java
 */
public class NumberSelect {

	private static int[] intFeld;
	private static int max, min;

	public static void run() {

		intFeld = new int[4];
		Random random = new Random();
		
		System.out.println("generate 4 random number: ");
		for (int i = 0; i < 4; i++) {
			intFeld[i] = random.nextInt();
			System.out.printf("%d ", intFeld[i]);
		}
		System.out.println();

		max = intFeld[0];
		min = intFeld[0];

		for (int i = 0; i < intFeld.length; i++) {
			if (max < intFeld[i]) {
				max = intFeld[i];
			}
			if (min > intFeld[i]) {
				min = intFeld[i];
			}
		}
		System.out.println("the max: " + max);
		System.out.println("the min: " + min);

	}

}
