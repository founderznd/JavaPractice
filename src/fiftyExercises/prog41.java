/**
 * 
 */

package fiftyExercises;

/**
 * 海滩上有一堆桃子，五只猴子来分。
 * 第一只猴子把这堆桃子凭据分为五份，多了一个， 这只猴子把多的一个扔入海中，拿走了一份。
 * 第二只猴子把剩下的桃子又平均分成五份，又 多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做 的，问海滩上原来最少有多少个桃子？
 * 
 * @author nandi
 * 2015年12月21日
 * prog41.java
 */
public class prog41 {
	
	public static void monkeyPeach() {
		
		int n = 1;
		boolean isFound = false;
		
		while (!isFound) {
			
			n = n + 1;
			int tmp = n;
			for (int i = 0; i < 5; i++) {
				
				if (tmp < 0) {
					break;
				}
				
				tmp = tmp - 1;
				if (0 != tmp % 5) {
					break;
				}
				tmp = tmp * 4;
				tmp = tmp / 5;
				
				if (4 == i && 0 < tmp) {
					isFound = true;
				}
			}
		}
		
		System.out.println("一共有 " + n + " 个桃子");
	}
	
	public static void main(String[] args) {
		
		monkeyPeach();
		System.exit(0);
	}
}
