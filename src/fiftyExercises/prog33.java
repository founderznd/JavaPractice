/**
 * 
 */

package fiftyExercises;

/**
 * 打印出杨辉三角形
 * 
 * @author nandi
 * 2015年12月21日
 * prog33.java
 */
public class prog33 {
	
	//标准答案是用矩阵，编程比这个要简单，但是我总感觉浪费了很多空间~~~所以还是用我自己的方法
	
	public static void printYungTriangle(int n) {
		
		int[] tmp = new int[1];
		
		for (int i = 0; i < n; i++) {
			
			int[] tmp2 = new int[i + 1];
			System.out.print("\t");
			
			for (int j = 0; j < n - i; j++) {
				
				System.out.print("  ");
			}
			
			for (int j = 0; j <= i; j++) {
				
				int a;
				if (0 == j || i == j) {
					a = 1;
				}
				else {
					a = tmp[j - 1] + tmp[j];
				}
				System.out.print(a + "   ");
				tmp2[j] = a;
			}
			System.out.println();
			tmp = tmp2;
		}
	}
	
	public static void main(String[] args) {
		
		printYungTriangle(8);
		System.exit(0);
	}
}
