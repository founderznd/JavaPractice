/**
 * 
 */

package filePractice;

/**
 * 
 * 
 * @author nandi
 * 2015��12��18��
 * mainClass.java
 */
public class mainClass {
	
	public static void main(String[] args) {
		
		String path = "";
		fileClass fc = new fileClass(path);
		fc.getFiles(".ttf");
		fc.showAll();
//		fc.copyAll(des);
//		fc.moveFile(des, des2);
//		fc.deleteAll(destination);
	}
}
