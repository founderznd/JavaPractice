/**
 * 
 */
package fiftyExercises;

/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？ 
 * 
 * @author nandi
 * 2015年12月10日
 * prog10.java
 */
public class prog10 {
	
	public static void main(String[] args) {
		
		double h = 100;
		double s = 100;
		
		for (int i = 0; i < 10; i++) {
			h = h / 2;
			s = s + h;
		}
		
		System.out.println("s = " + s + "  ,  h = " + h);
	}
}
