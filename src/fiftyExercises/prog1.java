/**
 * 
 */
package fiftyExercises;

/**
 * 有一对兔子，从出生后第3个月起每月都生1对兔子，小兔子长到第3个月后每个月又生1对兔子，加入兔子不死，问每个月的兔子总数
 * 
 * @author nandi
 * 2015年12月9日
 * e1.java
 */
public class prog1 {
	
	public static int rabbit(int n) {
		
		if (2 > n) { return 1; }
		
		return rabbit(n - 1) + rabbit(n - 2);
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 9; i++) {
			System.out.printf("第%d个月一共有%d对兔子\n", i + 1, rabbit(i));
		}
	}
	
}
