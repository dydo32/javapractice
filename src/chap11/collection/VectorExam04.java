package chap11.collection;

import java.util.Vector;

public class VectorExam04 {

	public static void main(String[] args) {
		/*
		 * ��ȣ ���� ���� ���� ���� 1 �嵿�� 100 99 88 2 �̹�ȣ 89 100 78 3 ����� 95 89 100
		 * 
		 * => ���� ���� �����͸� ���Ϳ� �����ϱ�: Vector<Vector<String>>
		 */
		// �ϳ��� ���ͷ� ǥ���� ���ڵ带 ���� ���͸� ����
		// => ���Ͱ� ����� ����
		Vector<Vector<String>> vlist = new Vector<Vector<String>>();

		// �� �л��� �����͸� ������ ���͵��� �����ϰ� �����͸� add(����-3��)
		Vector<String> v1 = new Vector<String>();
		v1.add("�嵿��");
		v1.add("100");
		v1.add("99");
		v1.add("88");
		Vector<String> v2 = new Vector<String>();
		v2.add("�̹�ȣ");
		v2.add("89");
		v2.add("100");
		v2.add("78");
		Vector<String> v3 = new Vector<String>();
		v3.add("�����");
		v3.add("95");
		v3.add("89");
		v3.add("100");

		vlist.add(v1);
		vlist.add(v2);
		vlist.add(v3);
		
		display(vlist);
	}
	// �޼ҵ� ���� - �Ű������� vlist�� ���޹޾Ƽ� ���� ����ϴ� �޼ҵ带 ���� display
	// hint) �Ű������� ���޵� ���Ϳ��� ���͸� ������ ����ؾ� �ϹǷ� ���� for�� �̿�
	// =>���ϰ� ���ȭ�� ĸ�� ����
	public static void display(Vector<Vector<String>> vlist){
		for(int row = 0; row < vlist.size(); row++){
			//���Ϳ� ����� ��Ҹ� ������. �� ��Ұ� DB�� �� ���ڵ��� ����
			Vector<String> v = vlist.get(row);
			//���� ���ڵ� (����)�ȿ� ����Ǿ��ִ� �÷��� ������ �ٽ� ������.
			for(int col = 0; col < v.size(); col++){
				String colValue = v.get(col);
				System.out.print(colValue + "\t");
			}
			System.out.println();
		}
		/*for (int i = 0; i < vlist.size(); i++) {
			for(int j = 0; j < (vlist.get(i)).size(); j++){
				System.out.print((vlist.get(i)).get(j)+"\t");
			}
			System.out.println();
		}*/
		
	}
}
