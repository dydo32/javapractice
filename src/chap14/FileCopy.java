package chap14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//실행횟수, 실행시간 측정
public class FileCopy {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("src/chap14/InputStreamTest.java");
			fw = new FileWriter("src/chap14/data/result.txt");
			
			//실행횟수를 저장할 변수 선언
			int count = 0;
			//실행시간을 측정
			long start = System.nanoTime();
			while(true){
				int data = fr.read();	//한문자씩읽기
				if(data == -1){
					break;
				}
				count++; //while문의 실행횟수를 count하기위해 증가시킴
			}
			long end = System.nanoTime();
			System.out.println("실행횟수 => "+count);
			System.out.println("실행시간 => "+(end-start));
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
