/**
 * 
 */
package fiftyExercises;

/**
 * �ж�101��200֮���ж��ٸ��������������������
 * 
 * @author nandi
 * 2015��12��9��
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
		System.out.printf("һ����%d������\n", count);
	}
}
