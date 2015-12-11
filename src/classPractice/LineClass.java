/**
 * 
 */
package classPractice;

/**
 * ʵ��һ��line�࣬a b c��Ϊ�򣬲��ң�a+b>0, c==0||c==1
 * 
 * @author nandi
 * 2015��12��9��
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
