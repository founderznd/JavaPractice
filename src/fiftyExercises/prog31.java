/**
 * 
 */

package fiftyExercises;

/**
 * 将一个数组逆序输出
 * 
 * @author nandi
 * 2015年12月21日
 * prog31.java
 */
public class prog31 {
	
	private static int[] a;
	
	public static void generateArray(int n) {
		
		a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100 + 1);
		}
	}
	
	public static void printArray() {
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void revertArray() {
		
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		generateArray(10);
		printArray();
		revertArray();
	}
}
