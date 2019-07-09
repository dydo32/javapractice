package chap11.collection;

import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		// 1. Vector생성 - Generic으로 Vector에 저장되는 요소의 타입을 명시
		// => Vector안에 저장되는 데이터의 타입을 제한(기본형인 경우에는 Wrapper타입명시)
		Vector<Integer> v = new Vector<Integer>(); // 제네릭안에있는타입
		v.add(10);
		System.out.println("현재 벡터에 저장된 요소의 갯수=>" + v.size());
		System.out.println("현재 벡터의 용량=>" + v.capacity());
		for (int i = 1; i <= 10; i++) {
			v.add(i);
		}
		System.out.println("현재 벡터에 저장된 요소의 갯수=>" + v.size());
		System.out.println("현재 벡터의 용량=>" + v.capacity());
		System.out.println("벡터에 저장된 0번요소=>" + v.get(0));

		// Vector에 저장된 모든 요소를 꺼내기.
		for (int i = 0; i < v.size(); i++) {
			int data = v.get(i); // 오토언박싱 - 자동으로 객체를 int형 데이터로 변환
			System.out.println(i + "번째요소=>" + data);
		}

	}
}
