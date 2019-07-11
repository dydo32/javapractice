package chap14;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest02 {

	public static void main(String[] args) {
		File file = new File("D:/work/javapractice/test");
		// file객체의 내부에 존재하는 파일과 모든 폴더를 출력하자.
		// a ---------------[폴더]
		// ...
		// 템플릿.java -------[파일(15:2018/06/08)]
		// -- ----------
		// 파일사이즈 마지막으로 수정한 날짜

		// listFiles 하면 하위 목록 빼올 수 있음
		File[] files = file.listFiles();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM/dd");

		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				System.out.println(files[i].getName() + "---------[폴더]");
			} else {
				System.out.println(files[i].getName() + "---------[파일(" + files[i].length() + ":"
						+ simple.format(files[i].lastModified()) + ")]");
			}
		}
	}
}
