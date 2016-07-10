/**
 * 
 */

package javaExam;

import java.util.Scanner;

/**
 * 
 * 
 * @author nandi
 * 2015Äê12ÔÂ23ÈÕ
 * RPGer.java
 */
public class RPGer {
	
	private static int n;
	
	private static int a;
	
	private static int c;
	
	private static int[] b;
	
	public static void input() {
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		a = s.nextInt();
		
		b = new int[n];
		for (int i = 0; i < b.length; i++) {
			b[i] = s.nextInt();
		}
		
		s.close();
	}
	
	public static int glc(int a, int b) {
		
		if (a == b) { return a; }
		if (a < b) {
			return glc(a, b - a);
		}
		else {
			return glc(a - b, b);
		}
	}
	
	public static void gaming() {
		
		c = a;
		
		for (int i = 0; i < b.length; i++) {
			if (b[i] <= c) {
				c += b[i];
			}
			else {
				c += glc(b[i], c);
			}
		}
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		input();
		gaming();
	}
}
