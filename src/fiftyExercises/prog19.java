/**
 * 
 */

package fiftyExercises;

/**
 * ��ӡ������ͼ�������Σ� 
 * 		*
 * 	       ***
 * 	      *****
 * 	     ******* 
 * 	      *****
 * 	       ***
 * 		* 
 * @author nandi
 * 2015��12��10��
 * prog19.java
 */
public class prog19 {
	
	public static void main(String[] args) {
		
		int N = 7;
		for (int i = 0; i < N; i++) {
			if (i < N / 2) { //�ϰ�Σ��ո��𽥼��٣�*������
				for (int j = 0; j < N - i - 1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {//�°�Σ��ո������ӣ�*�𽥼���
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
