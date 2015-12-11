/**
 * 
 */

package fiftyExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * һ�� 5 λ�����ж����ǲ��ǻ��������� 12321 �ǻ���������λ����λ��ͬ��ʮλ��ǧ λ��ͬ�� 
 * 
 * @author nandi
 * 2015��12��10��
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
