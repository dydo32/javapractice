package chap07;

public class Alcohol extends Drink {
	private double alcper; //���ڿ� ����

	public Alcohol(){}
	 //��������� �ʱ�ȭ�ϴ� ������ �޼���
	public Alcohol(int alcper) {
		super();
		this.alcper = alcper;
	}
	public Alcohol(String name, int price, int count, double alcper) {
		super(name, price, count);
		this.alcper=alcper;
	}
	
	//�θ� Ŭ������ Drink �� printTitle() �޼����� ����� ������(�������̵�)
	public static void printTitle(){
		System.out.println("��ǰ��(����[%])\t�ܰ�\t����\t�ݾ�");
	}
	public void printData(){
		System.out.println(name+"("+this.alcper+")\t"+price+
												"\t"+count+"\t"+ getTotalPrice());
	}
	
}
