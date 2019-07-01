package ans.chap14;

import java.io.*;

public class Ch14_Exam07 {
	public static void main(String[] args) throws IOException {

		String str = "동해물과백두산이 마르고 닳도록 \n  " 
		+ "하느님이 보우하사 우리나라만세 \n";

		File f = new File("t.txt");
		FileWriter fw = new FileWriter(f);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(str);
		bw.close();

		fw.close();

		String res = null;
		while ((res = br.readLine()) != null) {
			System.out.println(res);
		}

		br.close();
		fr.close();

	}

}
