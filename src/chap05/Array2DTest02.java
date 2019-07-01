package chap05;
//2차원배열 정의하고 액세스

//=> 자바에서 다차원 배열은 배열을 참조하는 배열

public class Array2DTest02 {
	public static void main(String[] args) {
		// 2차원배열의 선언과 생성과 초기화를 한꺼번에
		int[][] data = {  // data= new int[4][5];
				{ 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 }, 
				};
		int[][] data2 = new int[][]{
				{ 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 }, 
				};
		
		
		//1차원배열을 선언하고 위의 2차원 배열의 각 요소에서 참조하는 배열의 합을 저장한 후 출력하기
		//hapdata(1차원배열변수), data배열을 이용해서 작업
		//length 사용
		int[] hapdata = new int[data.length];
		
		for(int outer=0; outer<data.length;outer++){
			for(int inner=0; inner<data[outer].length;inner++){
				hapdata[outer] = hapdata[outer] + data[outer][inner];
			}
		}
		for(int i=0; i<hapdata.length; i++){
			System.out.println("각 요소에서 참조하는 배열의 합: "+hapdata[i]);
		}
	}
}
