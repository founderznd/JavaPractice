/**
 * 
 */

package fiftyExercises;

/**
 * �� n ����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ�������� 1 �� 3 �������������� 3 �����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ�� 
 * 
 * @author nandi
 * 2015��12��21��
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
				System.out.println("������������� " + a[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		removeCycle(7);
		System.exit(0);
	}
}
