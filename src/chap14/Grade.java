package chap14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Grade {

	public static void main(String args[]) { 
		
		Grade grade = new Grade();
		
		String fileName = "score.txt";
		grade.printGrade(fileName);
		
	}
	public void printGrade(String fileName) {
		/* 이곳에 프로그램을 완성하십시오. */ 
		BufferedReader br = null;
	
		try {
			br = new BufferedReader(new FileReader("src/chap14/data/"+fileName));
			int sum = 0;
			int count = 0;
			while(true){
				String line = br.readLine();	//한줄씩 읽는다.
				if(line == null){
					break;
				}
				String[] dataArr = line.split(",");
				sum = sum + Integer.parseInt(dataArr[1]);
				System.out.println(dataArr[0] +"의 점수는 "+dataArr[1]+"점 입니다.");
				/*StringTokenizer st = new StringTokenizer(line,",");
				while(st.hasMoreTokens()){
					String name = st.nextToken();
					int score = Integer.parseInt(st.nextToken());
					sum = sum+score;
					System.out.println(name +"의 점수는 "+score+"점 입니다.");
				}*/
				count ++;
			}
			
			System.out.println("모두의 총점은 "+sum+"점 입니다.");
			System.out.println("모두의 평균은 "+(sum/count)+"점 입니다.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(br!=null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} 
	
}