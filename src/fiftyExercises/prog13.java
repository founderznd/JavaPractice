/**
 * 
 */
package fiftyExercises;

/**
 * һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣� 
 * ��ȫƽ������һ�����������Լ�����1*1��2*2,3*3�ȵȣ��������ơ�
 * @author nandi
 * 2015��12��10��
 * prog13.java
 */
public class prog13 {
	
	public static void main(String[] args) {
		
		for (int i = -100; i < 10000; i++) {
			double k = Math.sqrt(i + 100);
			int nk = (int) k;
			if (nk == k) {
				k = Math.sqrt(i + 168);
				nk = (int) k;
				if (nk == k) {
					System.out.println(i);
				}
			}
		}
	}
}
