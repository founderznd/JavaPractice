/**
 * 
 */

package fiftyExercises;

/**
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20 项之和。 
 * 
 * @author nandi
 * 2015年12月10日
 * prog20.java
 */
public class prog20 {
	
	public static int fib(int n) {
		
		if (n < 2) { return n; }
		
		return fib(n - 1) + fib(n - 2);
	}
	
	public static void main(String[] args) {
		
		double sum = 0;
		
		for (int i = 1; i < 21; i++) {
			sum = sum + (double) fib(i + 1) / fib(i + 2);
		}
		
		System.out.println(sum);
	}
}
