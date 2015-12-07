/**
 * 
 */

package fiftyExercises;

/**
 * 有5 个人坐在一起，问第5个人多少岁？
 * 他说比第 4个人大 2岁。
 * 问第 4个人岁数， 他说比第 3个人大 2岁。
 * 问第三个人，又说比第 2人大两岁。问第2 个人，说比第一个人大 两岁。
 * 最后问第一个人，他说是10 岁。请问第五个人多大？ 
 * 
 * @author nandi
 * 2015年12月10日
 * prog23.java
 */
public class prog23 {
	
	public static void main(String[] args) {
		
		int age = 10;
		
		for (int i = 1; i < 5; i++) {
			age += 2;
		}
		
		System.out.println("age = " + age);
	}
}
