package chap07;

public class Drink {
	String name; //��ǰ��
	int price; //�ܰ�
	int count; //����
	
	public Drink(){}
	//������� �ʱ�ȭ�ϴ� �����ڸ޼ҵ�
	public Drink(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	//�ݾ�(�ܰ�*����)�� ����ϴ� getTotalPrice() �޼���
	public int getTotalPrice(){
		return price*count;
	}
	//Ÿ��Ʋ�� ����ϴ� printTitle() �޼���
	public static void printTitle(){
		System.out.println("��ǰ��\t�ܰ�\t����\t�ݾ�");
	}
	//��ǰ�� ������ ����ϴ� printData() �޼���
	public void printData(){
		System.out.println(name+"\t"+price+"\t"+count+"\t"+getTotalPrice());
	}
	
}
