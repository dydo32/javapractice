package ans.chap05;

public class Ch05_Exam07 {
	// S=AXB��� ǥ���Ѵ�. 
	//2���� �迭 A(2,4)�� B(4,3)�� �־����� �� �� �� ����� ���� ���Ͽ� S(2,3)�� �����ϴ� �˰����� �����϶�.

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
