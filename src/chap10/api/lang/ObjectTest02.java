package chap10.api.lang;

public class ObjectTest02 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		if(obj1 == obj2){	//�ּҺ�
			System.out.println("����. ");
		}else{
			System.out.println("�ٸ���.");
		}
		
		if(obj1.equals(obj2)){	//ObjectŬ������ equals�� �ּ��� ��
			System.out.println("����.");
		}else{
			System.out.println("�ٸ���.");
		}
	}
}
