package ans.chap14;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Ch14_Exam09 {
	public static void main(String[] args) {
		try {
			String filePath = "a.html";
			String zipPath = "a.zip";
			ZipOutputStream zipOutStream = new ZipOutputStream(
					new FileOutputStream(zipPath));

			ZipEntry entry = new ZipEntry(filePath);
			ZipEntry entry01 = new ZipEntry("c.txt");
			ZipEntry entry02 = new ZipEntry("d.txt");					
			
			FileInputStream fileInStream = 
					new FileInputStream(filePath);
			zipOutStream.putNextEntry(entry);
			zipOutStream.putNextEntry(entry01);
			zipOutStream.putNextEntry(entry02);
	
		
for (int i = fileInStream.read(); i != -1; i = fileInStream.read()) {
			zipOutStream.write(i);
			}

			fileInStream.close();
			zipOutStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
