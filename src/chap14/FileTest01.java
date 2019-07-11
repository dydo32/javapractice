package chap14;

import java.io.File;

//FileŬ������ API�� ���ؼ� ���캸��
public class FileTest01 {
	public static void main(String[] args) {
		// �׼����ϰ� ���� ������ ������ ��� - ���� ���. �����
		File file = new File("D:/work/javapractice/test"); // c:\\ict\\test - \\ �̰� 2�� �����, �׷��� Ư�����ڷ� �ν�
		File file2 = new File("src/chap14/data/test.txt");
		
		System.out.println(file);
		System.out.println(file2);
		
		System.out.println("file2.canRead()=> "+file2.canRead());
		System.out.println("file2.canWrite()=> "+file2.canWrite());
		
		System.out.println("file2.getAbsolutePath()=> "+file2.getAbsolutePath());
		System.out.println("file2.getName()=> "+file2.getName());
		System.out.println("file2.getParent()=> "+file2.getParent());
		System.out.println("file2.getPath()=> "+file2.getPath());
		
		System.out.println("file2.isDirectory()=>"+file2.isDirectory());
		System.out.println("file.isDirectory()=>"+file.isDirectory());
		System.out.println("file2.isFile()=>"+file2.isFile());
		System.out.println("file.isFile()=>"+file.isFile());
		System.out.println("file2.lastModified()=>"+file2.lastModified());
		System.out.println("file.lastModified()=>"+file.lastModified());
		System.out.println("file2.length()=>"+file2.length());
		System.out.println("file.length()=>"+file.length());
	
	}
}
