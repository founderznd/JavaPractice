/**
 * 
 */

package fiftyExercises;

/**
 * ��n��������ʹ��ǰ�����˳�������m��λ�ã����m���������ǰ���m����
 * 
 * @author nandi
 * 2015��12��21��
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
