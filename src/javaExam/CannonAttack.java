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
 * CannonAttack.java
 */
public class CannonAttack {
	
	public static int[] a;
	
	public static int R;
	
	public static int damage;
	
	public static void attack() {
		
		a = new int[9];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		s.close();
		
		R = a[0];
		point cannon1 = new point(a[1], a[2]);
		point cannon2 = new point(a[3], a[4]);
		point cannon3 = new point(a[5], a[6]);
		point target = new point(a[7], a[8]);
		
		damage = 0;
		
		if (R >= cannon1.calDistance(target)) {
			damage++;
		}
		if (R >= cannon2.calDistance(target)) {
			damage++;
		}
		if (R >= cannon3.calDistance(target)) {
			damage++;
		}
		
		System.out.println(damage + "x");
	}
	
	public static void main(String[] args) {
		
		attack();
	}
}

class point {
	
	private int x;
	
	private int y;
	
	public point(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	public double calDistance(point p) {
		
		double d = Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
		return d;
	}
	
}
