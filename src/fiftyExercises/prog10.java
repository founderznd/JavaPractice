/**
 * 
 */
package fiftyExercises;

/**
 * һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������� ��10�����ʱ�������������ף���10�η�����ߣ� 
 * 
 * @author nandi
 * 2015��12��10��
 * prog10.java
 */
public class prog10 {
	
	public static void main(String[] args) {
		
		double h = 100;
		double s = 100;
		
		for (int i = 0; i < 10; i++) {
			h = h / 2;
			s = s + h;
		}
		
		System.out.println("s = " + s + "  ,  h = " + h);
	}
}
