/**
 * 
 */

package fiftyExercises;

/**
 * 求 100 之内的素数 
 * 
 * @author nandi
 * 2015年12月11日
 * prog27.java
 */
public class prog27 {
	
	public static boolean isPrim(int n) {
		
		for (int i = 2; i < n / 2 + 1; i++) {
			if (0 == n % i) { return false; }
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		for (int i = 2; i < 101; i++) {
			if (isPrim(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
}
