/**
 * 
 */

package fiftyExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 一个 5 位数，判断它是不是回文数。即 12321 是回文数，个位与万位相同，十位与千 位相同。 
 * 
 * @author nandi
 * 2015年12月10日
 * prog25.java
 */
public class prog25 {
	
	public static boolean isPalindrome(String str) {
		
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) { return false; }
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("input a number (10000~99999):");
		String str = br.readLine();
		System.out.println(isPalindrome(str) ? str + " is Palindrome" : str + " is not Palindrome");
	}
}
