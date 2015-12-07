/**
 * 
 */
package stringPractice;

/**
 * 
 * 
 * @author nandi 2015Äê12ÔÂ7ÈÕ
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
