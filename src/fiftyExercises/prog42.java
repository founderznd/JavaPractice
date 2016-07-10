/**
 * 
 */

package fiftyExercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 有五个学生，每个学生有 3 门课的成绩，从键盘输入以上数据（包括学生号，姓名， 三门课成绩），计算出平均成绩，把原有的数据和计算出的平均分数存放在磁盘文件 "stud "中。 
 * 
 * @author nandi
 * 2015年12月23日
 * prog42.java
 */
public class prog42 {
	
	private static File f;
	
	private static Student[] st;
	
	public static void createFile(String path) {
		
		f = new File(path);
		try {
			f.createNewFile();
			if (!f.exists()) {
				System.err.println("create failed");
				System.exit(0);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void inputStudents(int n) {
		
		st = new Student[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < st.length; i++) {
			System.err.print("输入第" + (i + 1) + "个学生资料：（姓名，学号，成绩1，成绩2，成绩3）：");
			String str = sc.nextLine();
			String[] ss = str.split(" +");
			st[i] = new Student(ss[0], Integer.parseInt(ss[1]), Double.parseDouble(ss[2]), Double.parseDouble(ss[3]), Double.parseDouble(ss[4]));
		}
		sc.close();
	}
	
	public static void writeToFile() {
		
		try {
			FileWriter bw = new FileWriter(f);
			for (int i = 0; i < st.length; i++) {
				
				Student s = st[i];
				
				String str = s.getId() + "\t" + s.getName() + "\t\t" + s.getVorlesung1() + "\t" + s.getVorlesung2() + "\t" + s.getVorlesung3()
						+ "\t" + s.calAverage() + "\n";
				bw.write(str);
			}
			bw.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		createFile("stud");
		inputStudents(2);
		writeToFile();
		System.exit(0);
	}
}

class Student {
	
	private String name;
	
	private int id;
	
	private double vorlesung1;
	
	private double vorlesung2;
	
	private double vorlesung3;
	
	public Student(String name, int id, double v1, double v2, double v3) {
		this.name = name;
		this.id = id;
		this.vorlesung1 = v1;
		this.vorlesung2 = v2;
		this.vorlesung3 = v3;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		
		this.name = name;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		
		this.id = id;
	}
	
	/**
	 * @return the vorlesung1
	 */
	public double getVorlesung1() {
		
		return vorlesung1;
	}
	
	/**
	 * @param vorlesung1 the vorlesung1 to set
	 */
	public void setVorlesung1(int vorlesung1) {
		
		this.vorlesung1 = vorlesung1;
	}
	
	/**
	 * @return the vorlesung2
	 */
	public double getVorlesung2() {
		
		return vorlesung2;
	}
	
	/**
	 * @param vorlesung2 the vorlesung2 to set
	 */
	public void setVorlesung2(int vorlesung2) {
		
		this.vorlesung2 = vorlesung2;
	}
	
	/**
	 * @return the vorlesung3
	 */
	public double getVorlesung3() {
		
		return vorlesung3;
	}
	
	/**
	 * @param vorlesung3 the vorlesung3 to set
	 */
	public void setVorlesung3(int vorlesung3) {
		
		this.vorlesung3 = vorlesung3;
	}
	
	public double calAverage() {
		
		return (vorlesung1 + vorlesung2 + vorlesung3) / 3;
	}
	
}
