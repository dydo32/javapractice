package chap05;
//2�����迭 �����ϰ� �׼���

//=> �ڹٿ��� ������ �迭�� �迭�� �����ϴ� �迭

public class Array2DTest02 {
	public static void main(String[] args) {
		// 2�����迭�� ����� ������ �ʱ�ȭ�� �Ѳ�����
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
		
		
		//1�����迭�� �����ϰ� ���� 2���� �迭�� �� ��ҿ��� �����ϴ� �迭�� ���� ������ �� ����ϱ�
		//hapdata(1�����迭����), data�迭�� �̿��ؼ� �۾�
		//length ���
		int[] hapdata = new int[data.length];
		
		for(int outer=0; outer<data.length;outer++){
			for(int inner=0; inner<data[outer].length;inner++){
				hapdata[outer] = hapdata[outer] + data[outer][inner];
			}
		}
		for(int i=0; i<hapdata.length; i++){
			System.out.println("�� ��ҿ��� �����ϴ� �迭�� ��: "+hapdata[i]);
		}
	}
}
