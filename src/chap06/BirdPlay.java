package chap06;
/*����3. ������ ���� ������ �а� Duck�� Sparrow Ŭ������ �ۼ��Ͻʽÿ�. 
 * 		PlayBird Ŭ������ �����ϼ���.(����) 
 *  ����(Duck) Ŭ������ ����(Sparrow) Ŭ������ 
 *  �̸��� ��Ÿ���� name�� �ٸ��� �� �� ��Ÿ���� legs, �����̸� ��Ÿ���� length �����͸� ������ �ִ�. 
 *  �޼ҵ�δ� ���� fly, ��� sing, �̸�����ϱ� setName, ���ڿ�����ϱ� toString �� ������ �ִ�. 
 *  PlayBird Ŭ������ �̿��Ͽ� �� Ŭ������ �޼ҵ带 ȣ������� �� �ֿܼ� ��µǴ� ����� ������ ����. 
 *  
 *  [PlayBird ������] 
 *  	����(�в���)�� ���� �ʽ��ϴ�. 
 *  	����(�в���)��  �Ҹ����� ��ϴ�. 
 *  	������ �̸��� �в��� �Դϴ�. 
 *  	����(±±)�� ���ƴٴմϴ�. 
 *  	����(±±)��  �Ҹ����� ��ϴ�. 
 *  	������ �̸��� ±± �Դϴ�
 */
public class BirdPlay {
 	public static void main(String s[]){
		Duck duck = new Duck();
		duck.setName("�в���");
		duck.fly();
		duck.sing();
		System.out.println(duck.toString());
		
		Sparrow sparrow = new Sparrow();
		sparrow.setName("±±");
		sparrow.fly();
		sparrow.sing();
		System.out.println(sparrow.toString());
	
	}
}
