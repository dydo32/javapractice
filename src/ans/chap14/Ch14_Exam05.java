package ans.chap14;

import java.nio.channels.FileChannel;
import java.io.*;

public class Ch14_Exam05 {
	public static void main(String[] args) {
		  File sf=new File("a.txt");
		  File df=new File("b.txt");
		  fileCopy(sf, df);
	}
	
	public static void fileCopy(File sf, File df) {
		FileChannel sc = null, dc = null;
		try {
			sc = new FileInputStream(sf).getChannel();
			dc = new FileOutputStream(df).getChannel();
			dc.transferFrom(sc, 0, sc.size());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dc != null)
				try {
					dc.close();
				} catch (IOException e) {
				}
			if (sc != null)
				try {
					sc.close();
				} catch (IOException e) {
				}
		}
	}
}
