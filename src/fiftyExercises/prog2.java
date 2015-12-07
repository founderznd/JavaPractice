/**
 * 
 */
package fiftyExercises;

/**
 * 判断101到200之间有多少个素数，并输出所有素数
 * 
 * @author nandi
 * 2015年12月9日
 * prog2.java
 */
public class prog2 {
	
	public static boolean isPrim(int n) {
		
		for (int i = 2; i < n; i++) {
			if (0 == n % i) { return false; }
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i = 101; i <= 200; i++) {
			if (isPrim(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.printf("一共有%d个素数\n", count);
	}
}
