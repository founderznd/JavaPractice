/**
 * 
 */
package fiftyExercises;

/**
 * 有1、2、3、4 四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 
 * 
 * @author nandi
 * 2015年12月10日
 * prog11.java
 */
public class prog11 {
	
	public static void main(String[] args) {
		
		int save = 0;
		int c = 0;
		int a = 0;
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				for (int j2 = 1; j2 < 5; j2++) {
					if (i != j && i != j2 && j != j2) {
						a = 100 * i + 10 * j + j2;
						if (a != save) {
							c++;
							System.out.print(a + " ");
						}
						;
						save = a;
					}
				}
			}
		}
		System.out.println("\n" + c);
	}
}
