/**
 * 
 */

package fiftyExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输入某年某月某日，判断这一天是这一年的第几天？例如 5.3.2015
 * 
 * @author nandi
 * 2015年12月10日
 * prog14.java
 */
public class prog14 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("input date:");
		String datestr = br.readLine();
		String[] str = datestr.split("\\.");
		
		int d = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int y = Integer.parseInt(str[2]);
		int days = 0;
		int day = 0;
		
		for (int i = 1; i < m; i++) {
			switch (i) {
				case 2:
					if ((0 == y % 400) || (0 == y % 4 && 0 != y % 100)) {
						day = 29;
					}
					else {
						day = 28;
					}
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
					day = 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					day = 30;
					break;
				default:
					break;
			}
			days = days + day;
		}
		days = days + d;
		System.out.println(datestr.toString() + " is the " + days + " th day of " + y);
	}
}
