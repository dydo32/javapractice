package chap05;
//�迭�� ���ϰ� �׼����ϱ�.
public class ArrayTest03 {
	public static void main(String[] args){
		String[] myarr = new String[5];
		myarr[0] = new String("java");
		//�迭 ����� ������ ���.. �迭�� ����=>�迭����.length
		//==>�迭�� ������ index�� �迭�� ����-1 
		System.out.println("�迭�� ����� ���� =>"+myarr.length);
		
		for(int i=0; i<myarr.length; i++){
			System.out.println(myarr[i]);
		}
	}
}
