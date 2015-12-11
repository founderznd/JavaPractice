/*
 * ������ʽΪ first middle last ���������� last, first m. ����ʽ��ӡ����������m. ���м����ֵĵ�һ���ַ������û��middle���ⲻ��ʾ
 */

package stringPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NameConvert {

	private String first, last, middle, name;
	private String[] names;

	public void setName() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("print your name: ");
		try {
			name = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		names = name.split(" +"); //������ʽ����ʾ1�����߶���ո�
	}

	public void printName() {
		if (names.length == 3) {
			first = names[0];
			middle = names[1];
			last = names[2];
			System.out.println("your name is : " + last + ", " + first + " " + middle.charAt(0) + ".");
		} else if (names.length == 2) {
			first = names[0];
			last = names[1];
			System.out.println("your name is : " + last + ", " + first);
		} else {
			System.out.println("wrong name format");
		}
	}

	public void printName2() {

		if (names.length == 2) {
			for (String string : names) {
				string = string.toLowerCase();
				String str = string.substring(0, 1);
				string = string.replaceFirst(str, str.toUpperCase());
				System.out.print(string + " ");
			}
			System.out.println();
		} else {
			System.out.println("wrong name format");
		}
	}
}
