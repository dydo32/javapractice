package chap04;
/*1.
   HapTest.java
   1���� 100���� ¦���� Ȧ���� ��ü�� ���ؼ� ���
      ¦����:____
      Ȧ����:____
      ��ü��:____
 */

public class HapTest {
	public static void main(String[] args) {
		int even = 0;	//¦����
		int odd = 0;  	//Ȧ����
		int sum = 0; 	//����
		
		for(int i=1;i<=100;i++){
			if(i%2==0){
				even = even+i;
			}
			else{
				odd = odd+i;
			}
			sum = sum+i;
		}
		System.out.println("¦����: "+even);
		System.out.println("Ȧ����: "+odd);
		System.out.println("��ü��: "+sum);
	}
}





