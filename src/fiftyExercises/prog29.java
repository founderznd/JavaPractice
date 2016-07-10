/**
 * 
 */

package fiftyExercises;

/**
 * ��һ�� n*n ����Խ���Ԫ��֮�� 
 * 
 * @author nandi
 * 2015��12��21��
 * prog29.java
 */
public class prog29 {
	
	private static int[][] m;
	
	public static void generateMatrix(int n) {
		
		m = new int[n][n];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = (int) (Math.random() * 100 + 1);
			}
		}
	}
	
	public static void printMatrix() {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void getSum() {
		
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum = sum + m[i][i];
		}
		System.out.println("�Խ���֮��Ϊ��" + sum);
	}
	
	public static void main(String[] args) {
		
		generateMatrix(3);
		printMatrix();
		getSum();
		System.exit(0);
	}
}
