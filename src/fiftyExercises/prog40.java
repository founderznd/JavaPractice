/**
 * 
 */

package fiftyExercises;

/**
 * 字符串排序。。。真无聊。。
 * 
 * @author nandi
 * 2015年12月21日
 * prog40.java
 */
public class prog40 {
	
	private static String[] str;
	
	public static void randomStrings(int n) {
		
		str = new String[n];
		
		for (int i = 0; i < str.length; i++) {
			
			str[i] = Character.toString((char) (int) (Math.random() * 25 + 97));
			
			for (int j = 0; j < (int) (Math.random() * 10 + 1); j++) {
				str[i] += Character.toString((char) (int) (Math.random() * 25 + 97));
			}
		}
	}
	
	public static void printStrings() {
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t\t");
		}
		System.out.println();
	}
	
	public static void stringSort() {
		
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				int k = 0;
				while (k < str[i].length() && k < str[j].length()) {
					String tmp = new String();
					if (str[i].charAt(k) < str[j].charAt(k)) {
						tmp = str[i];
						str[i] = str[j];
						str[j] = tmp;
					}
					else {
						k++;
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		randomStrings(3);
		System.out.println("随机生成的字符串为：");
		printStrings();
		
		stringSort();
		System.out.println("排序以后：");
		printStrings();
	}
	
}
