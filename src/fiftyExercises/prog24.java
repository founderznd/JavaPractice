/**
 * 
 */

package fiftyExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ��һ�������� 5 λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�
 * 
 * @author nandi
 * 2015��12��10��
 * prog24.java
 */
public class prog24 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("input number(1~99999):");
		String str = br.readLine();
		int n = str.length();
		System.out.println(str + " has " + n + " numbers");
		System.out.println("reverse the number");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
	}
}
