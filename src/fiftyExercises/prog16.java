/**
 * 
 */

package fiftyExercises;

/**
 * ���9*9�ھ�
 * 
 * @author nandi
 * 2015��12��10��
 * prog16.java
 */
public class prog16 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.print(i + " * " + (j+1) + " = " + i * (j + 1) + "\t");
			}
			System.out.println();
		}
	}
}
