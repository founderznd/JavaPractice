/**
 * 
 */
package fiftyExercises;

/**
 * ��ӡ������ˮ�ɻ�����ˮ�ɻ�����һ����λ��������153 = 1^3 + 5^3 + 3^3
 * 
 * @author nandi
 * 2015��12��9��
 * prog3.java
 */
public class prog3 {
	
	public static void main(String[] args) {
		
		int a, b, c;
		int tmp;
		
		for (int i = 100; i < 1000; i++) {
			
			tmp = i;
			c = tmp % 10;
			tmp = i / 10;
			b = tmp % 10;
			tmp = tmp / 10;
			a = tmp % 10;
			
			tmp = a * a * a + b * b * b + c * c * c;
			if (tmp == i) {
				System.out.println(tmp + " ��ˮ�ɻ���");
			}
		}
	}
}
