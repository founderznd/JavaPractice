/**
 * 
 */
package fiftyExercises;

import java.util.Scanner;

/**
 * 运用条件运算符的嵌套来完成，成绩>=90的用A表示，60-89之间用B表示，60分以下的用C表示
 * 
 * @author nandi
 * 2015年12月9日
 * prog5.java
 */
public class prog5 {
	
	public static void giveNote() {
		
		System.out.print("请输入成绩: ");
		
		Scanner s = new Scanner(System.in);
		int note = s.nextInt();
		
		String str = (note >= 90) ? "A" : (note >= 60) ? "B" : "C";
		System.out.println("你的成绩: " + str);
		s.close();
	}
	
	public static void main(String[] args) {
		
		giveNote();
	}
}
