package ans.chap16;

import java.io.*;
import java.net.*;

public class ReverseEchoer {
	public static void main(String[] args) {
		try (	ServerSocket s = new ServerSocket(8888);){
			Socket c = s.accept();
			BufferedWriter w = 
					new BufferedWriter(new OutputStreamWriter(
					c.getOutputStream()));
			
			BufferedReader r = 
					new BufferedReader(new InputStreamReader(
					c.getInputStream()));
			
			String m = "에코 서버에 단어를 입력하세요 : ";
			w.write(m, 0, m.length());
			w.newLine();
			w.flush();
			while ((m = r.readLine()) !=null) {
				if (m.equals("."))
					break;
				char[] a = m.toCharArray();				
				int n = a.length;
				for (int i = 0; i < n / 2; i++) {
					char t = a[i];
					a[i] = a[n - 1 - i];
					a[n - i - 1] = t;
				}
				w.write(a, 0, n);
				w.newLine();
				w.flush();
			}
			w.close();
			r.close();
			c.close();		
		} catch (IOException e) {
			System.err.println(e.toString());
		}
	}
}
