/**
 * 
 */
package fiftyExercises;

/**
 * 打印出所有水仙花数，水仙花数是一个三位数，例如153 = 1^3 + 5^3 + 3^3
 * 
 * @author nandi
 * 2015年12月9日
 * prog3.java
 */
public class prog3 {
	
	public static void main(String[] args) {
		
		int a, b, c;
		int tmp;
		
		for (int i = 100; i < 1000; i++) {
			
			tmp = i;
			c = tmp % 10;
			tmp = i / 10;
			b = tmp % 10;
			tmp = tmp / 10;
			a = tmp % 10;
			
			tmp = a * a * a + b * b * b + c * c * c;
			if (tmp == i) {
				System.out.println(tmp + " 是水仙花数");
			}
		}
	}
}
