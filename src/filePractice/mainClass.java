/**
 * 
 */

package filePractice;

/**
 * 
 * 
 * @author nandi
 * 2015Äê12ÔÂ18ÈÕ
 * mainClass.java
 */
public class mainClass {
	
	public static void main(String[] args) {
		
		String path = "C:/Users/Administrator/Desktop/Programming Fonts Collection";
		String des = "C:/Users/Administrator/Desktop/test1";
		String des2= "C:/Users/Administrator/Desktop/test2";
		fileClass fc = new fileClass(path);
		fc.getFiles(".ttf");
		fc.showAll();
//		fc.copyAll(des);
		fc.moveFile(des, des2);
//		fc.deleteAll(destination);
	}
}
