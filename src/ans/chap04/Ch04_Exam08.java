package ans.chap04;

public class Ch04_Exam08 {

	public static void main(String[] args) {
		int tot=0;

		for(int i=1; i<=50; i++)
		{
			int j=(int)(Math.random()*100)+1;
			System.out.printf("%5d ",j);

			if(i%6==0)
			{
				System.out.println();
			}
			tot+=j;
		}
		System.out.println("\nÇÕ : "+tot);
	}

}
