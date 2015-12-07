/**
 * 
 */

package fiftyExercises;

/**
 * 两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。 
 * 
 * @author nandi
 * 2015年12月10日
 * prog18.java
 */
public class prog18 {
	
	public static void main(String[] args) {
		
		String[] m = { "a", "b", "c" };
		String[] n = { "x", "y", "z" };
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				if (m[i].equals("a") && n[j].equals("x") || m[i].equals("a") && n[j].equals("y")) {
					continue;
				}
				if (m[i].equals("b") && n[j].equals("y") || m[i].equals("b") && n[j].equals("z")) {
					continue;
				}
				if (m[i].equals("c") && n[j].equals("x") || m[i].equals("c") && n[j].equals("z")) {
					continue;
				}
				System.out.println(m[i] + " vs " + n[j]);
			}
		}
		
	}
}
