/**
 * 
 */
package fiftyExercises;

/**
 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？ 
 * 完全平方即用一个整数乘以自己例如1*1，2*2,3*3等等，依此类推。
 * @author nandi
 * 2015年12月10日
 * prog13.java
 */
public class prog13 {
	
	public static void main(String[] args) {
		
		for (int i = -100; i < 10000; i++) {
			double k = Math.sqrt(i + 100);
			int nk = (int) k;
			if (nk == k) {
				k = Math.sqrt(i + 168);
				nk = (int) k;
				if (nk == k) {
					System.out.println(i);
				}
			}
		}
	}
}
