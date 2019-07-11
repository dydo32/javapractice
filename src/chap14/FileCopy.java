package chap14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//����Ƚ��, ����ð� ����
public class FileCopy {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("src/chap14/InputStreamTest.java");
			fw = new FileWriter("src/chap14/data/result.txt");
			
			//����Ƚ���� ������ ���� ����
			int count = 0;
			//����ð��� ����
			long start = System.nanoTime();
			while(true){
				int data = fr.read();	//�ѹ��ھ��б�
				if(data == -1){
					break;
				}
				count++; //while���� ����Ƚ���� count�ϱ����� ������Ŵ
			}
			long end = System.nanoTime();
			System.out.println("����Ƚ�� => "+count);
			System.out.println("����ð� => "+(end-start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fr != null) fr.close();
				if(fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
