/**
 * 
 */
package fiftyExercises;

/**
 * �ֽ������������磺����90,��ӡ��90=2*3*3*5
 * 
 * @author nandi
 * 2015��12��9��
 * prog4.java
 */
public class prog4 {
	
	public static void factoring(int n) {
		
		System.out.print(n + " = ");
		for (int i = 2; i < n; i++) {
			if (0 == n % i) {
				System.out.print(i + " * ");
				n = n / i;
				i = 1;
			}
		}
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		factoring(90);
	}
}
