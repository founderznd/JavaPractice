/**
 * 
 */

package fiftyExercises;

import java.util.Scanner;

/**
 * ���� 3 ���� a,b,c������С˳�������
 * 
 * @author nandi
 * 2015��12��21��
 * prog34.java
 */
public class prog34 {
	
	//�����Ŀʵ��̫���ġ��������������������
	
	public static void main(String[] args) {
		
		int[] a = new int[3];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		s.close();
		
		prog28.setArray(a);
		prog28.heapSort();
		prog28.printNumbers();
	}
}
