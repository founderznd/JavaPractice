/**
 * 
 */
package fiftyExercises;

/**
 * һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ����������6 = 1 + 2 +3
 * �ҳ�1000���ڵ���������
 * 
 * @author nandi
 * 2015��12��10��
 * prog9.java
 */
public class prog9 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 1000; i++) {
			
			int sum = 0;
			for (int j = 1; j < i; j++) {
				
				if (0 == i % j) {
					sum = sum + j;
				}
			}
			if (sum == i) {
				System.out.print(sum + " ");
			}
		}
		System.out.println();
	}
}
