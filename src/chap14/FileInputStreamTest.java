package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

//���Ϸκ��� �����͸� �о ����Ϳ� ��� - byte������ �б�
//���Ͽ���, ���Ͼ׼���, ���ϴݱ� - 3�ܰ�� �۾�
public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		PrintStream myout = System.out;

		try {
			fis = new FileInputStream("src/chap14/data/test.txt"); // ���Ͽ���
			while (true) {
				int data = fis.read(); // ���� �׼���
				if (data == -1) {
					break;
				}
				myout.print((char) data); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close(); // ���ϴݱ�
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
