package chap14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//src/InputStreamTest.java를 result.txt로 복사
public class FileCopy2 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("src/chap14/InputStreamTest.java");
			fw = new FileWriter("src/chap14/data/result.txt");
			
			while(true){
				int data = fr.read();		//한문자씩읽기
				if(data == -1){
					break;
				}
				fw.write((char)data);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fr != null) fr.close();
				if(fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
