/**
 * 
 */

package fiftyExercises;

/**
 * ����ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ���������������������Ա����������������a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ������� 
 * 
 * @author nandi
 * 2015��12��10��
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
