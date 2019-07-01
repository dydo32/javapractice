package ans.chap14;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ch14_Exam04 {
	public static void main(String[] args) {
		Prn01();
		Prn02();
	}
	private static void Prn01() {
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths
				.get("."))) {
			for (Path path : stream) {
				if (Files.isRegularFile(path))
					System.out.println("파일 :" + path.getFileName());
				else if (Files.isDirectory(path))
					System.out.println("디렉토리: " + path.getFileName());
			}

		} catch (IOException | DirectoryIteratorException ex) {
			ex.printStackTrace();
		}
		System.out.println("====================");
	}

	private static void Prn02() {
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get("."), "* .jpg")) {
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}

		} catch (IOException | DirectoryIteratorException ex) {
			ex.printStackTrace();
		}
		System.out.println("====================");
	}
}
