/**
 * 
 */

package fiftyExercises;

/**
 * ��̲����һ�����ӣ���ֻ�������֡�
 * ��һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ���� ��ֻ���ӰѶ��һ�����뺣�У�������һ�ݡ�
 * �ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��� ����һ������ͬ���Ѷ��һ�����뺣�У�������һ�ݣ����������ġ�����ֻ���Ӷ��������� �ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ�
 * 
 * @author nandi
 * 2015��12��21��
 * prog41.java
 */
public class prog41 {
	
	public static void monkeyPeach() {
		
		int n = 1;
		boolean isFound = false;
		
		while (!isFound) {
			
			n = n + 1;
			int tmp = n;
			for (int i = 0; i < 5; i++) {
				
				if (tmp < 0) {
					break;
				}
				
				tmp = tmp - 1;
				if (0 != tmp % 5) {
					break;
				}
				tmp = tmp * 4;
				tmp = tmp / 5;
				
				if (4 == i && 0 < tmp) {
					isFound = true;
				}
			}
		}
		
		System.out.println("һ���� " + n + " ������");
	}
	
	public static void main(String[] args) {
		
		monkeyPeach();
		System.exit(0);
	}
}
