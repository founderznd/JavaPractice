/**
 * 
 */

package fiftyExercises;

/**
 * ��ӡ�����������
 * 
 * @author nandi
 * 2015��12��21��
 * prog33.java
 */
public class prog33 {
	
	//��׼�����þ��󣬱�̱����Ҫ�򵥣��������ܸо��˷��˺ܶ�ռ�~~~���Ի��������Լ��ķ���
	
	public static void printYungTriangle(int n) {
		
		int[] tmp = new int[1];
		
		for (int i = 0; i < n; i++) {
			
			int[] tmp2 = new int[i + 1];
			System.out.print("\t");
			
			for (int j = 0; j < n - i; j++) {
				
				System.out.print("  ");
			}
			
			for (int j = 0; j <= i; j++) {
				
				int a;
				if (0 == j || i == j) {
					a = 1;
				}
				else {
					a = tmp[j - 1] + tmp[j];
				}
				System.out.print(a + "   ");
				tmp2[j] = a;
			}
			System.out.println();
			tmp = tmp2;
		}
	}
	
	public static void main(String[] args) {
		
		printYungTriangle(8);
		System.exit(0);
	}
}
