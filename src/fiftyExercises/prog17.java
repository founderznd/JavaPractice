/**
 * 
 */

package fiftyExercises;

/**
 * ���ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ�� �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
 * �Ժ�ÿ�����϶�����ǰһ��ʣ�� ��һ����һ��������10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�
 * 
 * @author nandi
 * 2015��12��10��
 * prog17.java
 */
public class prog17 {
	
	public static void main(String[] args) {
		
		int n = 1;
		for (int i = 0; i < 9; i++) {
			n = 2 * (n + 1);
		}
		
		System.out.println("totally " + n);
	}
}
