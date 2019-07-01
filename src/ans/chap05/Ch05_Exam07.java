package ans.chap05;

public class Ch05_Exam07 {
	// S=AXB라고 표현한다. 
	//2차원 배열 A(2,4)와 B(4,3)이 주어졌을 때 이 두 행렬의 곱을 구하여 S(2,3)에 저장하는 알고리즘을 제시하라.

	public static void main(String[] args) {
		int [][]A={{5,7,10,4},{2,5,3,6}};
	    int [][]B={{4,1,1,},{-6,7,5,},{9,9,4},{2,5,5}};
	    int [][]RES=new int[2][3];
	 
	    int i,j,k;
	    int sum;
	 
	    for(i=0; i<2; i++){
	        for(j=0; j<3; j++){
	            sum=0;
	            for(k=0; k<4; k++){
	                sum+=A[i][k]*B[k][j];
	            }
	            RES[i][j]=sum;
	        }
	    }
	 
	    for(i=0; i<2; i++){
	        for(j=0; j<3; j++){
	           System.out.printf("%d\t",RES[i][j]);
	        }
	        System.out.println();
	    }

	}

}
