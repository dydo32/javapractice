package chap11.collection;

import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		// 1. Vector���� - Generic���� Vector�� ����Ǵ� ����� Ÿ���� ���
		// => Vector�ȿ� ����Ǵ� �������� Ÿ���� ����(�⺻���� ��쿡�� WrapperŸ�Ը��)
		Vector<Integer> v = new Vector<Integer>(); // ���׸��ȿ��ִ�Ÿ��
		v.add(10);
		System.out.println("���� ���Ϳ� ����� ����� ����=>" + v.size());
		System.out.println("���� ������ �뷮=>" + v.capacity());
		for (int i = 1; i <= 10; i++) {
			v.add(i);
		}
		System.out.println("���� ���Ϳ� ����� ����� ����=>" + v.size());
		System.out.println("���� ������ �뷮=>" + v.capacity());
		System.out.println("���Ϳ� ����� 0�����=>" + v.get(0));

		// Vector�� ����� ��� ��Ҹ� ������.
		for (int i = 0; i < v.size(); i++) {
			int data = v.get(i); // �����ڽ� - �ڵ����� ��ü�� int�� �����ͷ� ��ȯ
			System.out.println(i + "��°���=>" + data);
		}

	}
}
