/**
 * 
 */
package fiftyExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ����һ���ַ����ֱ�ͳ�Ƴ����е�Ӣ����ĸ���ո����ֺ������ַ��ĸ���
 * 
 * @author nandi
 * 2015��12��9��
 * prog7.java
 */
public class prog7 {
	
	public static void main(String[] args) throws IOException {
		
		int alpha, num, space, other;
		alpha = 0;
		num = 0;
		space = 0;
		other = 0;
		String str = new String();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���д���ʲô...");
		str = br.readLine();
		
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if (Character.isAlphabetic(ch[i])) {
				alpha++;
			}
			else if (Character.isDigit(ch[i])) {
				num++;
			}
			else if (Character.isSpaceChar(ch[i])) {
				space++;
			}
			else {
				other++;
			}
		}
		
		System.out.println("��������ǣ�" + str);
		System.out.println("һ���� " + alpha + " ����ĸ�� " + num + " �����֣�" + space + " ���ո񣬺� " + other + " �����Ķ���");
		
	}
}
