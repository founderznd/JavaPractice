/**
 * 
 */

package fiftyExercises;

/**
 * 利用递归方法求5!。 
 * 
 * @author nandi
 * 2015年12月10日
 * prog22.java
 */
public class prog22 {
	
	public static long fac(int n) {
		
		if (1 == n) { return 1; }
		return n * fac(n - 1);
	}
	
	public static void main(String[] args) {
		
		System.out.println("5! = " + fac(5));
	}
}
