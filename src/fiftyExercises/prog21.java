/**
 * 
 */

package fiftyExercises;

/**
 * 求1+2!+3!+...+20!的和 
 * 
 * @author nandi
 * 2015年12月10日
 * prog21.java
 */
public class prog21 {
	
	public static long fac(int n) {
		
		if (n == 1) { return 1; }
		return n * fac(n - 1);
	}
	
	public static void main(String[] args) {
		
		long sum = 0;
		long tmp = 0;
		int N = 10;
		
		System.out.print("sum = ");
		for (int i = 1; i < N; i++) {
			tmp = fac(i);
			sum += tmp;
			System.out.print(i + "! + ");
		}
		tmp = fac(N);
		sum += tmp;
		
		System.out.println(N + "! = " + sum);
	}
}
