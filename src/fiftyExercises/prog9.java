/**
 * 
 */
package fiftyExercises;

/**
 * 一个数如果恰好等于它的因子之和，这个数就称为完数，例如6 = 1 + 2 +3
 * 找出1000以内的所有完数
 * 
 * @author nandi
 * 2015年12月10日
 * prog9.java
 */
public class prog9 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 1000; i++) {
			
			int sum = 0;
			for (int j = 1; j < i; j++) {
				
				if (0 == i % j) {
					sum = sum + j;
				}
			}
			if (sum == i) {
				System.out.print(sum + " ");
			}
		}
		System.out.println();
	}
}
