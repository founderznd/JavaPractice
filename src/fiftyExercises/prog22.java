/**
 * 
 */

package fiftyExercises;

/**
 * ���õݹ鷽����5!�� 
 * 
 * @author nandi
 * 2015��12��10��
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
