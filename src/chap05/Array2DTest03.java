package chap05;
//가변배열
public class Array2DTest03 {
	public static void main(String[] args) {
		char[][] myarr = new char[5][];
		myarr[0] = new char[1];
		myarr[1] = new char[2];
		myarr[2] = new char[3];
		myarr[3] = new char[4];
		myarr[4] = new char[5];
		//2차원 가변배열에 값을 할당
		for(int i=0; i<myarr.length; i++){
			for(int j =0; j<myarr[i].length; j++){
				myarr[i][j] = '*';
			}
		}
		//2차원 배열에서 값을 꺼내서 출력하기
		for(int i=0; i<myarr.length; i++){
			for(int j =0; j<myarr[i].length; j++){
				System.out.print(myarr[i][j]);
			}
			System.out.println();
		}
	}
}
