/**
 * 
 */
package fiftyExercises;

/**
 * ��һ�����ӣ��ӳ������3������ÿ�¶���1�����ӣ�С���ӳ�����3���º�ÿ��������1�����ӣ��������Ӳ�������ÿ���µ���������
 * 
 * @author nandi
 * 2015��12��9��
 * e1.java
 */
public class prog1 {
	
	public static int rabbit(int n) {
		
		if (2 > n) { return 1; }
		
		return rabbit(n - 1) + rabbit(n - 2);
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 9; i++) {
			System.out.printf("��%d����һ����%d������\n", i + 1, rabbit(i));
		}
	}
	
}
