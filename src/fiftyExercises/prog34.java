/**
 * 
 */

package fiftyExercises;

import java.util.Scanner;

/**
 * 输入 3 个数 a,b,c，按大小顺序输出。
 * 
 * @author nandi
 * 2015年12月21日
 * prog34.java
 */
public class prog34 {
	
	//这个题目实在太无聊。。。不就是排序嘛。。。
	
	public static void main(String[] args) {
		
		int[] a = new int[3];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		s.close();
		
		prog28.setArray(a);
		prog28.heapSort();
		prog28.printNumbers();
	}
}
