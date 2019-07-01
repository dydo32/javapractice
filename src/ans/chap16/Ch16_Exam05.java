package ans.chap16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Ch16_Exam05 {

	public static void main(String[] args) {
		FileOutputStream out=null;
		try {
			URL url = new URL("http://plaza.seoul.go.kr/archives/405");
		    out = new FileOutputStream("Ch16_Exam05.txt");
			InputStream input = url.openStream();
			while (true) {
				int read = input.read();
				if (read == -1)
					break;
				out.write(read);
			}
			out.close();
		} catch (Exception e) {
			System.err.println(e);
		}finally{			
			try {
				out.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}

	}
}
