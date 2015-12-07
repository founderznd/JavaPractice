/**
 * 
 */
package fiftyExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输入一行字符，分别统计出其中的英文字母、空格、数字和其他字符的个数
 * 
 * @author nandi
 * 2015年12月9日
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
		System.out.println("随便写点儿什么...");
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
		
		System.out.println("你输入的是：" + str);
		System.out.println("一共有 " + alpha + " 个字母， " + num + " 个数字，" + space + " 个空格，和 " + other + " 其他的东西");
		
	}
}
