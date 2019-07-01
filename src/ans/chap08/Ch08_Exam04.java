package ans.chap08;

interface Countable {
	int getCount ();
	void setCount (int aCounter);
}
class Dog implements Countable {
	private int counter;
	public int getCount () {
		return counter;
	}
	public void setCount (int aCounter) {
		counter = aCounter;
	}
}
class Cat implements Countable {
	private int number;
	public int getCount () {
		return number;
	}
	public void setCount (int aCounter) {
		number = aCounter;
	}
}

public class Ch08_Exam04 {
	public static void main(String[] args) {
		Dog dog = new Dog ();
		Cat cat = new Cat();
		
		// is-a ����
		Countable [] objs = {dog, cat}; 
		
		// �������̽� �޼ҵ��� ���
		objs [0] .setCount (10);
		objs [1] .setCount (2);
		
		for (int i = 0; i <objs.length; i++) {
			// �������̽� �޼ҵ��� ���
			System.out.println (objs [i] .getCount ());
		}
	}
}
