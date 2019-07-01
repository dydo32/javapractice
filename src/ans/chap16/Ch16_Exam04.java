package ans.chap16;

import java.io.*;
import java.net.*;

public class Ch16_Exam04 {
	public static void main(String[] args) {
		BufferedReader in 
		= 
		new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = System.out;
		try {
		
			Socket c = new Socket("localhost", 8888);
		
			BufferedWriter w = 
					new BufferedWriter(new OutputStreamWriter(
					c.getOutputStream()));
			
			BufferedReader r =
					new BufferedReader(new InputStreamReader(
					c.getInputStream()));
	
			String m = null;
			while ((m = r.readLine()) != null) {
				out.println(m);
				m = in.readLine();
				w.write(m, 0, m.length());
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
