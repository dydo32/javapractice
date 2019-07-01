package ans.chap11;

import java.util.StringTokenizer;

public class Ch11_Exam08 {

	 public static void main(String[] args) {
		 String str="1.22,4.12,5.93,8.71,9.34";
			double data[]=new double[5];
			double sum=0;
			
			StringTokenizer st=new StringTokenizer(str,",");
			
			for(int i=0; i<data.length; i++){
				data[i]=Double.parseDouble(st.nextToken());
			}
			for(int j=0; j<data.length; j++){
				sum+=data[j];
			}
			System.out.printf("ÇÕ°è:%.3f\n",sum);
			System.out.printf("Æò±Õ:%.3f",sum/data.length);

	}
}
