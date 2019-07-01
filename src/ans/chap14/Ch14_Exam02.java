package ans.chap14;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Ch14_Exam02 {

	public static void main(String[] args) throws Exception {

		Path dst = FileSystems.getDefault()
				.getPath("C:\\Test\\Ch14_Exam02.txt");

		Path newFile = Files.createFile(dst);
		try (BufferedWriter bw = Files.newBufferedWriter(newFile,
				Charset.forName("UTF-8"), StandardOpenOption.WRITE)) {
			bw.write("Getting Start Java");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
