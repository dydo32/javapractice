package ans.chap14;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ch14_Exam03 {
	public static void MY_Output(File f) throws IOException {
		FileWriter fw = new FileWriter(f);
		fw.write('a');
		fw.write("오늘은 목요일\n 이라네 ^.^\n");
		fw.write(100);
		fw.close();
	}
	public static void MY_Input(File f) {

		try (FileReader fr = new FileReader(f)) {
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				System.out.printf("%c", (char) ch);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		File f = new File("Ch14_Exam03.txt");
		try {
			MY_Output(f);
			MY_Input(f);
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
