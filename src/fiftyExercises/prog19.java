/**
 * 
 */

package fiftyExercises;

/**
 * 打印出如下图案（菱形） 
 * 		*
 * 	       ***
 * 	      *****
 * 	     ******* 
 * 	      *****
 * 	       ***
 * 		* 
 * @author nandi
 * 2015年12月10日
 * prog19.java
 */
public class prog19 {
	
	public static void main(String[] args) {
		
		int N = 7;
		for (int i = 0; i < N; i++) {
			if (i < N / 2) { //上半段，空格逐渐减少，*逐渐增加
				for (int j = 0; j < N - i - 1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {//下半段，空格逐渐增加，*逐渐减少
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * (N - i - 1) + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
