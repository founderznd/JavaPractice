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
	
	private static int[] a = { 231, 546, 3, 13, 43, 546, 7, 23, 4, 54 };
	
	public static void setFeld(int n) {
		
		a = new int[n];
		System.out.println("input " + n + " numbers:");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		
		s.close();
	}
	
	//bubble sort
	public static void bubbleSort() {
		
		int tmp;
		for (int i = 0; i < a.length - 1; i++) {
			
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		
	}
	
	//insertion Sort
	public static void insertSort() {
		
		printNumbers();
		int tmp;
		for (int i = 1; i < a.length; i++) {
			printNumbers();
			int j = i - 1;
			int k = 0;
			while (a[i] < a[j]) {
				j--;
				k++;
				if (j < 0) {
					k = k - 1;
					break;
				}
			}
			if (k > 0) {
				System.out.println("k = " + k + "  i = " + i);
				tmp = a[i];
				for (int j2 = 0; j2 < k; j2++) {
					a[i - j2] = a[i - j2 - 1];
				}
				a[j + 1] = tmp;
				
			}
		}
		
	}
	
	public static void printNumbers() {
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		insertSort();
		printNumbers();
	}
	
}
