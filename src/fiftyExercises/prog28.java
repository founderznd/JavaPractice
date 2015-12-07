/**
 * 
 */

package fiftyExercises;

import java.util.Scanner;

/**
 * 对 10 个数进行排序 
 * 
 * @author nandi
 * 2015年12月11日
 * prog28.java
 */
public class prog28 {
	
	private static int[] a;
	
	public static void bubble(int n) {
		
		a = new int[n];
		int tmp;
		System.out.println("input " + n + " numbers:");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		
		for (int i = 0; i < a.length - 1; i++) {
			
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		
		s.close();
	}
	
	//TODO实现其他至少2种算法
	
	public static void printNumbers() {
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		bubble(10);
		printNumbers();
	}
	
}
