/**
 * 
 */

package javaExam;

/**
 * 
 * 
 * @author nandi
 * 2016��1��5��
 * randomNumber.java
 */
public class randomNumber {
	
	public static final int N = 20;
	
	public static void main(String[] args) {
		
		System.out.println("���¼���Ϊ 20%");
		
		int c = 0;
		int k = 5;
		
		for (int i = 0; i < k; i++) {
			int n = (int) (Math.random() * 100) + 1;
			c = (n <= N) ? c + 1 : c;
		}
		System.out.println("һ������ " + k + " ��");
		System.out.println("�ɹ� " + c + " ��");
	}
}
