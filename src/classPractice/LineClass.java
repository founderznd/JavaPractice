/**
 * 
 */
package classPractice;

/**
 * 实现一个line类，a b c作为域，并且，a+b>0, c==0||c==1
 * 
 * @author nandi
 * 2015年12月9日
 * LineClass.java
 */
public class LineClass {
	
	private double a, b, c;
	
	public LineClass(double a, double b, double c) {
		
		if ((a != 0 || b != 0) && (c == 0 || c == 1)) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		else {
			this.a = 1;
			this.b = 2;
			this.c = 1;
		}
	}
	
	public void showLine() {
		
		System.out.printf("this line is: %.2fX + %.2fY + %.2f = 0\n", this.a, this.b, this.c);
	}
}
