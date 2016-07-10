/**
 * 
 */

package fiftyExercises;

/**
 * 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 * 
 * @author nandi
 * 2015年12月21日
 * prog35.java
 */
public class prog35 {
	
	public static void main(String[] args) {
		
		prog28.randomArray(10);
		prog28.printNumbers();
		int[] a = prog28.getArray();
		
		int max = 0;
		int min = 0;
		int tmp;
		
		for (int i = 0; i < a.length; i++) {
			if (a[min] > a[i]) {
				min = i;
			}
			if (a[max] < a[i]) {
				max = i;
			}
		}
		
		tmp = a[min];
		a[min] = a[a.length - 1];
		a[a.length - 1] = tmp;
		
		tmp = a[max];
		a[max] = a[0];
		a[0] = tmp;
		
		prog28.setArray(a);
		prog28.printNumbers();
	}
	
}
