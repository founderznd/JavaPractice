/**
 * 
 */

package fiftyExercises;

import java.util.Scanner;

/**
 * ��ҵ���ŵĽ������������ɡ�����(I)���ڻ����10��Ԫʱ���������10%��
 * �������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣��ɿ����7.5%��
 * 20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��
 * 40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
 * 60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ��Ӽ������뵱������I����Ӧ���Ž��������� 
 * 
 * @author nandi
 * 2015��12��10��
 * prog12.java
 */
public class prog12 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("print your profits: ");
		int profit = s.nextInt();
		double bonus = 0;
		
		if (profit <= 100000) {
			bonus = 0.1 * profit;
		}
		else if (profit <= 200000) {
			bonus = 10000 + (profit - 100000) * 0.075;
		}
		else if (profit <= 400000) {
			bonus = 17500 + (profit - 200000) * 0.05;
		}
		else if (profit <= 600000) {
			bonus = 17500 + 200000 * 0.05 + (profit - 400000) * 0.03;
		}
		else if (profit <= 1000000) {
			bonus = 17500 + 200000 * 0.08 + (profit - 600000) * 0.015;
		}
		else {
			bonus = 17500 + 200000 * 0.08 + 400000 * 0.015 + (profit - 1000000) * 0.001;
		}
		
		System.out.println("bonus = " + bonus);
		
		s.close();
	}
}
