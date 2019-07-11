package chap14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//BufferedReader로 데이터 읽기 - 버퍼를 이용하는 클래스		-> 성능향상을 위해 사용
//FileCopy와 비교
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
				String line = br.readLine(); // 한줄씩 읽는다.
				if (line == null) {
					break;
				}
				count++;
				// System.out.println("line: "+line);
			}
			long end = System.nanoTime();
			System.out.println("실행횟수 => " + count);
			System.out.println("실행시간 => " + (end - start));
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
