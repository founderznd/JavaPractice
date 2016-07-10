/**
 * 
 */

package fiftyExercises;

import java.util.Scanner;

/**
 * ��һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С�
 * 
 * @author nandi
 * 2015��12��21��
 * prog30.java
 */
public class prog30 {
	
	private static int[] a;
	
	public static void randomFeld(int n) {
		
		prog28.randomArray(n);
		prog28.heapSort();
		a = prog28.getArray();
	}
	
	public static void printFeld() {
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void insertNum() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("input number:");
		int k = s.nextInt();
		s.close();
		
		int[] aa = new int[a.length + 1];
		int n = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (k < a[i]) {
				n = i;
				break;
			}
		}
		
		for (int i = 0; i < n; i++) {
			aa[i] = a[i];
		}
		aa[n] = k;
		for (int i = n + 1; i < aa.length; i++) {
			aa[i] = a[i - 1];
		}
		a = aa;
	}
	
	public static void main(String[] args) {
		
		randomFeld(10);
		printFeld();
		insertNum();
		printFeld();
	}
}
