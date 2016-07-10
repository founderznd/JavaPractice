/**
 * 
 */

package fiftyExercises;

/**
 * 有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 * 
 * @author nandi
 * 2015年12月21日
 * prog36.java
 */
public class prog36 {
	
	public static void main(String[] args) {
		
		prog28.randomArray(10);
		prog28.printNumbers();
		
		int[] a = prog28.getArray();
		int[] b = new int[a.length];
		
		int m = 3;
		
		for (int i = 0; i < a.length; i++) {
			if (a.length == m) {
				m = 0;
			}
			b[m++] = a[i];
		}
		
		prog28.setArray(b);
		prog28.printNumbers();
	}
}
