package ans.chap14;

import java.io.*;

public class Ch14_Exam07 {
	public static void main(String[] args) throws IOException {

		String str = "���ع�����λ��� ������ �⵵�� \n  " 
		+ "�ϴ����� �����ϻ� �츮���󸸼� \n";

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
