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
		/* �̰��� ���α׷��� �ϼ��Ͻʽÿ�. */ 
		BufferedReader br = null;
	
		try {
			br = new BufferedReader(new FileReader("src/chap14/data/"+fileName));
			int sum = 0;
			int count = 0;
			while(true){
				String line = br.readLine();	//���پ� �д´�.
				if(line == null){
					break;
				}
				String[] dataArr = line.split(",");
				sum = sum + Integer.parseInt(dataArr[1]);
				System.out.println(dataArr[0] +"�� ������ "+dataArr[1]+"�� �Դϴ�.");
				/*StringTokenizer st = new StringTokenizer(line,",");
				while(st.hasMoreTokens()){
					String name = st.nextToken();
					int score = Integer.parseInt(st.nextToken());
					sum = sum+score;
					System.out.println(name +"�� ������ "+score+"�� �Դϴ�.");
				}*/
				count ++;
			}
			
			System.out.println("����� ������ "+sum+"�� �Դϴ�.");
			System.out.println("����� ����� "+(sum/count)+"�� �Դϴ�.");
			
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