/**
 * 
 */
package stringPractice;

/**
 * 
 * 
 * @author nandi 2015��12��7��
 *  TestClasses.java
 */
public class TestClasses {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			if (Mathematics.isSquare(i)) {
				System.out.println(i + " is Square.");
			}
		}
	}
}
