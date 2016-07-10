/**
 * 
 */

package fiftyExercises;

/**
 * 有 n 个人围成一圈，顺序排号。从第一个人开始报数（从 1 到 3 报数），凡报到 3 的人退出圈子，问最后留下的是原来第几号的那位。 
 * 
 * @author nandi
 * 2015年12月21日
 * prog37.java
 */
public class prog37 {
	
	private static int counterArray(int[] a) {
		
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (-1 != a[i]) {
				c++;
			}
		}
		return c;
	}
	
	public static void removeCycle(int n) {
		
		prog28.randomArray(n);
		
		int[] a = prog28.getArray();
		
		prog28.printNumbers();
		
		int t = 0;
		int c = 1;
		
		while (1 < counterArray(a)) {
			
			if (t == a.length) {
				t = 0;
			}
			
			if (3 == c && a[t] != -1) {
				a[t] = -1;
				c = 1;
			}
			if (-1 != a[t]) {
				c++;
			}
			t++;
			
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != -1) {
				System.out.println("最后留下来的是 " + a[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		removeCycle(7);
		System.exit(0);
	}
}
