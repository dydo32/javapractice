package chap14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//BufferedReader�� ������ �б� - ���۸� �̿��ϴ� Ŭ����		-> ��������� ���� ���
//FileCopy�� ��
public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		// FileReader fr = null;
		try {
			// fr = new FileReader("src/chap14/InputStreamTest.java");
			// br = new BufferedReader(fr);
			br = new BufferedReader(new FileReader("src/chap14/InputStreamTest.java"));
			int count = 0;
			long start = System.nanoTime();
			while (true) {
				String line = br.readLine(); // ���پ� �д´�.
				if (line == null) {
					break;
				}
				count++;
				// System.out.println("line: "+line);
			}
			long end = System.nanoTime();
			System.out.println("����Ƚ�� => " + count);
			System.out.println("����ð� => " + (end - start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
