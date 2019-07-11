package chap14;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest02 {

	public static void main(String[] args) {
		File file = new File("D:/work/javapractice/test");
		// file��ü�� ���ο� �����ϴ� ���ϰ� ��� ������ �������.
		// a ---------------[����]
		// ...
		// ���ø�.java -------[����(15:2018/06/08)]
		// -- ----------
		// ���ϻ����� ���������� ������ ��¥

		// listFiles �ϸ� ���� ��� ���� �� ����
		File[] files = file.listFiles();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM/dd");

		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				System.out.println(files[i].getName() + "---------[����]");
			} else {
				System.out.println(files[i].getName() + "---------[����(" + files[i].length() + ":"
						+ simple.format(files[i].lastModified()) + ")]");
			}
		}
	}
}
