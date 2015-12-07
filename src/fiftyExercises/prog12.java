/**
 * 
 */

package fiftyExercises;

import java.util.Scanner;

/**
 * 企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；
 * 40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？ 
 * 
 * @author nandi
 * 2015年12月10日
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
