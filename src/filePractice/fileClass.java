/**
 * 
 */

package filePractice;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * �ļ�������
 * 
 * @author nandi
 * 2015��12��18��
 * fileClass.java
 */
public class fileClass {
	
	private File f;//�ļ���
	
	private String keyWord;//�ؼ���
	
	private ArrayList<File> files;
	
	private ArrayList<File> tmp;
	
	public fileClass(String pathname) {
		this.f = new File(pathname);
		this.files = new ArrayList<File>();
		this.tmp = new ArrayList<File>();
	}
	
	/**
	 * ��ȡĿ¼�����к�׺Ϊsuffix���ļ�·����
	 * @param key
	 */
	public void getFiles(String key) {
		
		this.keyWord = key;
		getFiles(this.f, this.keyWord);
	}
	
	private void getFiles(File file, String key) {
		
		//�����Ŀ¼��������һ��ݹ�
		for (File f : file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				if (pathname.isDirectory()) {
					return true;
				}
				else {
					return false;
				}
				
			}
		})) {
			getFiles(f, key);
		}
		
		//������ļ������һ��ִ�в���
		for (File f : file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
				if (name.contains(key)) {
					return true;
				}
				else {
					return false;
				}
			}
		})) {
			files.add(f);
		}
	}
	
	private void getAllFiles(String path) {
		
		File f = new File(path);
		
		if (!f.exists()) {
			System.exit(0);
		}
		
		for (File file : f.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				if (pathname.isDirectory()) { return true; }
				return false;
			}
		})) {
			tmp.add(file);
			getAllFiles(file.getAbsolutePath());
		}
		
		for (File file : f.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				if (pathname.isFile()) { return true; }
				return false;
			}
		})) {
			tmp.add(file);
		}
	}
	
	/**
	 * ��source���Ƶ�path��
	 * @param source
	 * @param path
	 */
	private void copyFile(File source, String path) {
		
		byte[] buf = new byte[256];
		int len;
		
		String fname = source.getName();
		File fpath = new File(path);
		if (!fpath.exists()) {
			fpath.mkdirs();
		}
		File des = new File(path + "/" + fname);
		try {
			des.createNewFile();
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(des);
			while (-1 != (len = fis.read(buf, 0, buf.length))) {
				fos.write(buf, 0, len);
			}
			fis.close();
			fos.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ���������ļ���path
	 * @param path
	 */
	public void copyAll(String path) {
		
		for (File file : files) {
			copyFile(file, path);
		}
	}
	
	/**
	 * ɾ���ļ����Ŀ¼
	 * @param filename
	 */
	public void deleteFile(String filename) {
		
		File f = new File(filename);
		
		if (f.exists()) {
			
			if (f.isFile()) {
				f.delete();
			}
			if (f.isDirectory()) {
				if (0 == f.listFiles().length) {
					f.delete();
				}
				else {
					System.out.println(f.getName() + " is not empty");
				}
			}
		}
		else {
			System.out.println(f.getName() + " doesn't exist");
		}
	}
	
	public void deleteAll(String path) {
		
		File f = new File(path);
		
		if (f.exists()) {
			
			for (File file : f.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					
					if (pathname.isDirectory()) {
						return true;
					}
					else {
						return false;
					}
				}
			})) {
				deleteAll(file.getAbsolutePath());
			}
			
			for (File file : f.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					
					if (pathname.isFile() || 0 == pathname.listFiles().length) {
						return true;
					}
					else {
						return false;
					}
				}
			})) {
				file.delete();
			}
			f.delete();
		}
	}
	
	/**
	 * �ƶ��ļ�����Ŀ¼
	 * @param from
	 * @param to
	 */
	public void moveFile(String from, String to) {
		
		getAllFiles(from);
		
		if (0 < tmp.size()) {
			
			for (File file : tmp) {
				if (file.isFile()) {
					copyFile(file, to);				
				}
			}
			deleteAll(from);
		}
		else {
			System.out.println(from + " doesn't exits");
		}
	}
	
	public void showAll() {
		
		for (File f : files) {
			try {
				System.out.println(f.getCanonicalPath());
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
