/**
 * 
 */
package fiftyExercises;

import java.util.Scanner;

/**
 * ���������������Ƕ������ɣ��ɼ�>=90����A��ʾ��60-89֮����B��ʾ��60�����µ���C��ʾ
 * 
 * @author nandi
 * 2015��12��9��
 * prog5.java
 */
public class prog5 {
	
	public static void giveNote() {
		
		System.out.print("������ɼ�: ");
		
		Scanner s = new Scanner(System.in);
		int note = s.nextInt();
		
		String str = (note >= 90) ? "A" : (note >= 60) ? "B" : "C";
		System.out.println("��ĳɼ�: " + str);
		s.close();
	}
	
	public static void main(String[] args) {
		
		giveNote();
	}
}
