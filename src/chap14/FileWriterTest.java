package chap14;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		// ���� ����� �⺻�� �����.
		// �����ڿ� true�� �����ϸ� append��带 Ȱ��ȭ��Ű�� ��
		//FileWriter fw = new FileWriter("src/chap14/data/output.txt");
		FileWriter fw = new FileWriter("src/chap14/data/output2.txt",true);
		fw.write(97);
		fw.write("�ȳ�~~~~~~\n");
		fw.write("test");
		fw.close();
	}
}
